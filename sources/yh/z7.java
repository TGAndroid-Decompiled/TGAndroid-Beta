package yh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.ab;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n20;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import org.telegram.ui.to;
import org.telegram.ui.vb1;
import org.telegram.ui.w70;
import org.telegram.ui.yn;
public final class z7 extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f52355t0;
    public static DecimalFormat f52356u0;
    public FrameLayout P;
    public sg.e Q;
    public y7 R;
    public bw0 S;
    public ab T;
    public View U;
    public le.b V;
    public le.b W;
    public le.b X;
    public int Z;
    public int f52357a0;
    public boolean f52358b0;
    public boolean f52359c0;
    public n20 f52361e0;
    public u00 f52362f0;
    public LinearLayout f52363g0;
    public SpannableStringBuilder f52364h0;
    public org.telegram.ui.Components.p6 f52365i0;
    public TextView f52366j0;
    public ci.d f52367k0;
    public rg.j1 f52368l0;
    public ci.d m0;
    public vb1 f52369n0;
    public ci.d f52370o0;
    public ci.d f52371p0;
    public boolean f52372q0;
    public boolean f52373r0;
    public d7 f52374s0;
    public int Y = -1;
    public final o2 f52360d0 = new o2(this, 4);

    public z7() {
        this.M = true;
    }

    public static void C0(z7 z7Var, Context context) {
        if (MessagesController.getInstance(z7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(z7Var.currentAccount);
        } else {
            new p7(context, z7Var.resourceProvider).show();
        }
    }

    public static void D0(z7 z7Var) {
        u5.y(z7Var.currentAccount, false).u();
        tg.m1.e0(1, BirthdayController.getInstance(z7Var.currentAccount).getState());
    }

    public static void E0(yh.z7 r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: yh.z7.E0(yh.z7, int):void");
    }

    public static void F0(z7 z7Var, h61 h61Var, Boolean bool, String str) {
        if (z7Var.getParentActivity() != null) {
            if (bool.booleanValue()) {
                yc.a0(z7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h61Var.B, new Object[0])), R.raw.stars_topup).j();
                z7Var.f52362f0.c(true);
                u5.y(z7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, yc.a0(z7Var), R.raw.error, 36);
            }
        }
    }

    public static void K0(l01 l01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.d6 d6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((i01) l01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        v90 v90Var = new v90(textView, AndroidUtilities.dp(90.0f), 0, d6Var);
        v90Var.a(org.telegram.ui.ActionBar.i6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.i6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(v90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final u5 y3 = u5.y(i10, false);
            final long j3 = starGift.f20274id;
            final ii.q1 q1Var = new ii.q1(textView, 29);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    u5 u5Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (u5Var = u5.this).J(j3)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(u5Var.f52085a).removeObserver(notificationCenterDelegateArr[0], i13);
                        q1Var.run(J);
                    }
                }
            }};
            int i11 = y3.f52085a;
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

    public static void L0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new a7(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder O0(TL_stars.StarsAmount starsAmount) {
        return P0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder P0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f52356u0 == null) {
            f52356u0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f52356u0.format(j3 / 1.0E9d);
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
                DecimalFormat decimalFormat = f52356u0;
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

    public static SpannableStringBuilder Q0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        boolean z10;
        if (f52356u0 == null) {
            f52356u0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f52356u0.format(starsAmount.amount / 1.0E9d);
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
                DecimalFormat decimalFormat = f52356u0;
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

    public static SpannableStringBuilder R0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f52356u0 == null) {
                f52356u0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f52356u0.format(starsAmount.amount / 1.0E9d);
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
            if (f52356u0 == null) {
                f52356u0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f52356u0;
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

    public static String S0(long j3) {
        String str;
        if (f52355t0 == null) {
            f52355t0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f52355t0.format(j3 / 1.0E9d);
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

    public static java.lang.String T0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: yh.z7.T0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f7) {
        return V0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, float f7, float f10, float f11) {
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
        rq rqVar = new rq(R.drawable.diamond, 0);
        rqVar.recolorDrawable = false;
        rqVar.translate(0.0f, f10);
        rqVar.spaceScaleX = f11;
        rqVar.setScale(f7, f7);
        spannableString.setSpan(rqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(CharSequence charSequence) {
        return X0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder X0(CharSequence charSequence, float f7, rq[] rqVarArr) {
        return a1(false, charSequence, f7, rqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Y0(CharSequence charSequence, boolean z10) {
        return a1(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder a1(boolean z10, CharSequence charSequence, float f7, rq[] rqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        rq rqVar;
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
        if (rqVarArr == null || (rqVar = rqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            rqVar = new rq(i10, 0);
            if (rqVarArr != null) {
                rqVarArr[0] = rqVar;
            }
        }
        rqVar.translate(0.0f, f10);
        rqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f7 * 0.2f;
            rqVar.setScale(f12, f12);
        } else {
            rqVar.setScale(f7, f7);
        }
        spannableString.setSpan(rqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder b1(boolean z10, String str, rq[] rqVarArr) {
        rq rqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (rqVarArr == null || (rqVar = rqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            rqVar = new rq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            rqVar.setScale(f7, f10);
        }
        if (rqVarArr != null) {
            rqVarArr[0] = rqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(rqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder c1(TL_stars.StarsAmount starsAmount, String str, rq[] rqVarArr) {
        return d1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, rqVarArr);
    }

    public static SpannableStringBuilder d1(boolean z10, CharSequence charSequence, float f7, rq[] rqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        rq rqVar;
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
        if (rqVarArr == null || (rqVar = rqVarArr[0]) == null) {
            if (rqVarArr != null && rqVarArr.length > 0) {
                rqVar = new rq(i10, 0);
                rqVarArr[0] = rqVar;
            } else {
                rqVar = new rq(i10, 0);
            }
        }
        if (z10) {
            f7 *= 0.33f;
        } else {
            rqVar.recolorDrawable = false;
        }
        rqVar.setScale(f7, f7);
        spannableString.setSpan(rqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static s11 e1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
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
        return new s11(notificationCenter.listen(view, i10, new Utilities.Callback() {
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

    public static void f1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a4.a.l(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.i6.f20771a7, 0.35f), 0L, null, null, 0);
    }

    public static void g1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        f1(imageReceiver, document, i10);
    }

    public static void h1(w9 w9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 1000) {
            str = "2⃣";
        } else if (j3 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        e1(w9Var, imageReceiver, str, false);
    }

    public static s11 i1(w9 w9Var, ImageReceiver imageReceiver, int i10) {
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
        return e1(w9Var, imageReceiver, str, false);
    }

    public static void j1(w9 w9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 10000000000L) {
            str = "2⃣";
        } else if (j3 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        e1(w9Var, imageReceiver, str, true);
    }

    public static void k1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.d6 d6Var) {
        char c10;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i11 = bi.i(1, context, d6Var, false);
        LinearLayout e7 = bi.e(context, 1);
        e7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.z5.t(-1, 150, 7, 0, 0, 0, 10));
        c7 c7Var = new c7(context, 70, 0);
        frameLayout.addView(c7Var, w7.z5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        sg.a aVar = eVar.f46827b;
        aVar.f46815w = org.telegram.ui.ActionBar.i6.fk;
        aVar.f46816x = org.telegram.ui.ActionBar.i6.gk;
        aVar.b();
        eVar.setStarParticlesView(c7Var);
        frameLayout.addView(eVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.i6.f20935j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(20.0f), -6915073));
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
        rq rqVar = new rq(R.drawable.mini_boost_badge, 2);
        rqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        e7.addView(h, w7.z5.t(-2, 20, 17, 20, 4, 20, 4));
        l01 l01Var = new l01(context, d6Var);
        l01Var.k(LocaleController.getString(R.string.BoostFrom), i10, j3, new y5(f3VarArr, j3, 3));
        l01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            c10 = 0;
            xh.p0 p0Var = new xh.p0(f3VarArr, j3, boost, 3);
            f3VarArr = f3VarArr;
            l01Var.g(string, string2, p0Var);
        } else {
            c10 = 0;
        }
        String string3 = LocaleController.getString(R.string.BoostDate);
        int i13 = R.string.formatDateAtTime;
        String format = LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000));
        String format2 = LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[c10] = format;
        objArr[1] = format2;
        l01Var.c(string3, LocaleController.formatString(i13, objArr), null, null);
        String string4 = LocaleController.getString(R.string.BoostUntil);
        int i14 = R.string.formatDateAtTime;
        String format3 = LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000));
        String format4 = LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[c10] = format3;
        objArr2[1] = format4;
        l01Var.c(string4, LocaleController.formatString(i14, objArr2), null, null);
        e7.addView(l01Var, w7.z5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        q90 q90Var = new q90(context, d6Var);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new di.b(context, 9)));
        q90Var.setGravity(17);
        e7.addView(q90Var, w7.z5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new d6(f3VarArr, 1));
        e7.addView(dVar, w7.z5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = e7;
        f3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            f3VarArr[0].makeAttached(U);
        }
        eVar.setPaused(false);
        f3VarArr[0].show();
        f3VarArr[0].setOnDismissListener(new o2(eVar, 5));
    }

    public static j0 l1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        zf.a resellAmount;
        zf.b bVar = zf.b.f53323a;
        if (tL_starGiftUnique == null) {
            resellAmount = zf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f53324b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        j0 j0Var = new j0(context, d6Var, i10, resellAmount, new r6(0, callback2, r8));
        j0[] j0VarArr = {j0Var};
        j0Var.show();
        return j0VarArr[0];
    }

    public static void m1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.f3[] f3VarArr;
        long j10;
        boolean z11 = false;
        org.telegram.ui.ActionBar.f3 i12 = bi.i(1, context, d6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
        linearLayout.addView(textView, w7.z5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        ld0 ld0Var = new ld0(context, d6Var);
        ld0Var.setForceForceUseCenter(true);
        ld0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        ld0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
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
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21153uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21170vf, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new ei.x1(ld0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.z5.o(-1, -2, 1.0f, 119));
        ld0Var.e(editTextBoldCursor);
        ld0Var.addView(linearLayout2, w7.z5.e(-1, -2, 48));
        linearLayout.addView(ld0Var, w7.z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A6, false));
        ld0Var.addView(textView2, w7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        q90 q90Var = new q90(context, null);
        q90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new di.b(context, 10)), true));
        q90Var.setTextSize(1, 12.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        linearLayout.addView(q90Var, w7.z5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ci.d f7 = bi.f(24, context, d6Var, true);
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        f7.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(f7, w7.z5.n(-1, 48));
        if (i14 > 0 && z10) {
            dVar = bi.f(24, context, d6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.z5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i12.customView = linearLayout;
        final org.telegram.ui.ActionBar.f3[] f3VarArr2 = {i12};
        if (i14 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new b7(editTextBoldCursor, ld0Var, j3, z10, f7, textView2));
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
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new o6(editTextBoldCursor2, f3VarArr2, 1));
                return true;
            }
        });
        f7.setOnClickListener(new n6(zArr, callback2, editTextBoldCursor, f7, f3VarArr2));
        if (dVar != null) {
            ci.d dVar2 = dVar;
            n6 n6Var = new n6(zArr, callback2, dVar2, editTextBoldCursor, f3VarArr2);
            f3VarArr = f3VarArr2;
            dVar2.setOnClickListener(n6Var);
        } else {
            f3VarArr = f3VarArr2;
        }
        f3VarArr[0].fixNavigationBar();
        f3VarArr[0].setOnDismissListener(new ai.f5(editTextBoldCursor, 13));
        f3VarArr[0].show();
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof yn) {
            z11 = ((yn) R).O9();
        }
        o6 o6Var = new o6(f3VarArr, editTextBoldCursor);
        if (z11) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        AndroidUtilities.runOnUIThread(o6Var, j10);
    }

    public static org.telegram.ui.ActionBar.f3 n1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.d6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: yh.z7.n1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.f3");
    }

    public static void o1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f20276id = tL_messageActionPaymentRefunded.charge.f20175id;
        starsTransaction.refund = true;
        n1(activity, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void p1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f20276id = tL_payments_paymentReceiptStars.transaction_id;
        n1(context, false, 0L, i10, starsTransaction, d6Var);
    }

    public final void M0() {
        t1();
        zl0 zl0Var = this.f39950c;
        if (zl0Var != null && this.S != null && zl0Var.getLayoutParams() != null) {
            int C = bi.C(48.0f, this.Z, -AndroidUtilities.dp(8.0f));
            int C2 = bi.C(48.0f, this.f52357a0, -AndroidUtilities.dp(8.0f));
            AndroidUtilities.setViewLayoutMargins(this.f39950c, 0, C, 0, C2);
            zl0 zl0Var2 = this.f39950c;
            int i10 = -C;
            zl0Var2.setPadding(zl0Var2.getPaddingLeft(), i10, this.f39950c.getPaddingRight(), this.f52357a0 - C2);
            this.S.z(i10, -C2);
        }
    }

    public final void N0(ArrayList arrayList, w61 w61Var) {
        boolean z10;
        zl0 zl0Var;
        int i10;
        q1("FILL_BEFORE");
        bw0 bw0Var = this.S;
        if (bw0Var != null && bw0Var.f25125e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = -1;
        if (getParentActivity() == null) {
            return;
        }
        u5 y3 = u5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        h61 h61Var = new h61(-2);
        h61Var.f27086c = (n20) super.s0(getParentActivity());
        arrayList.add(h61Var);
        arrayList.add(h61.k(this.f52363g0));
        ci.d dVar = this.f52371p0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(h61.C(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(ei.i.a(-4, getThemedColor(org.telegram.ui.ActionBar.i6.uj), R.drawable.filled_earn_stars, to.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(h61.C(null));
        }
        if (y3.f52088e && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = q7.f51882a;
                h61 K = h61.K(q7.class);
                K.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(K);
            }
            if (y3.f52105x) {
                arrayList.add(h61.q(arrayList.size(), 33));
            } else if (!y3.f52106y) {
                h61 c10 = h61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f27098q = true;
                arrayList.add(c10);
            }
            arrayList.add(h61.C(null));
        }
        boolean O = y3.O(0);
        this.f52372q0 = O;
        if (O) {
            this.Y = arrayList.size();
            arrayList.add(h61.n(this.T, -2));
            if (z10 && (zl0Var = this.f39950c) != null) {
                o2 o2Var = this.f52360d0;
                zl0Var.removeCallbacks(o2Var);
                this.f39950c.post(o2Var);
            }
        } else {
            arrayList.add(h61.m(this.f52361e0));
        }
        q1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        bw0 bw0Var = new bw0(context);
        this.S = bw0Var;
        boolean z11 = true;
        bw0Var.setDebugLoggingEnabled(true);
        this.S.setCommonInsetsManagedExternally(true);
        if (!this.f52358b0) {
            org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
            if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
                i10 = 0;
            } else {
                i10 = AndroidUtilities.statusBarHeight;
            }
            this.Z = i10;
            this.f52357a0 = AndroidUtilities.navigationBarHeight;
        }
        this.S.setGeometry(new n2.c(this, 27));
        this.S.z(-bi.C(48.0f, this.Z, -AndroidUtilities.dp(8.0f)), -bi.C(48.0f, this.f52357a0, -AndroidUtilities.dp(8.0f)));
        bw0 bw0Var2 = this.S;
        bw0Var2.getClass();
        this.T = new ab(bw0Var2, context, 24);
        this.R = new y7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.S);
        this.f52361e0 = new n20(this, context, 14);
        super.createView(context);
        q20 q20Var = this.f39955s;
        getBaseSimpleGlass().d(q20Var, this.f39950c, this.actionBar, this.resourceProvider);
        this.actionBar.setBackground(null);
        this.f39958y.bringToFront();
        this.actionBar.bringToFront();
        getBaseSimpleGlass().h = this.S;
        this.f39950c.setCaptureSectionsDecoratorAllowed(true);
        this.R.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f15611i = new di.f(7, this, new di.e(2, q20Var));
        FrameLayout frameLayout = this.R.d;
        View view = new View(getParentActivity());
        this.U = view;
        view.setAlpha(0.0f);
        bw0 bw0Var3 = this.S;
        bw0Var3.addView(this.U, bw0Var3.indexOfChild(frameLayout), w7.z5.e(-1, 0, 48));
        this.U.setBackground(getBaseSimpleGlass().a(this.U));
        j6 j6Var = new j6(this, 0);
        tr trVar = tr.h;
        le.b bVar = new le.b(0, j6Var, trVar, 380L, false);
        this.V = bVar;
        this.W = new le.b(1, new j6(this, 1), trVar, 380L, false);
        this.X = new le.b(2, new j6(this, 2), trVar, 380L, false);
        if (!this.f39950c.canScrollVertically(-1) && !this.actionBar.s()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar.a(z10, false);
        this.W.a(this.S.f25125e0, false);
        this.f39950c.j(new xb0(this, 22));
        t1();
        ch.d c10 = getBaseSimpleGlass().f15607c.c(frameLayout, null, false);
        c10.w(eh.b.m(this.resourceProvider));
        c10.x(AndroidUtilities.dp(9.66f));
        c10.y(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.ActionBar.c5 c5Var2 = this.parentLayout;
        if (c5Var2 != null && ((ActionBarLayout) c5Var2).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 2);
        this.Q = eVar;
        sg.a aVar = eVar.f46827b;
        aVar.f46815w = org.telegram.ui.ActionBar.i6.fk;
        aVar.f46816x = org.telegram.ui.ActionBar.i6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.f39951e);
        this.P.addView(this.Q, w7.z5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        n0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new di.b(context, 7)), true), this.P, null);
        this.f39950c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.f46577m = false;
        jVar.C = false;
        jVar.o(trVar);
        jVar.n(350L);
        this.f39950c.setItemAnimator(jVar);
        this.f39950c.setOnItemClickListener(new ai.g(this, 21));
        u00 u00Var = new u00(getParentActivity());
        this.f52362f0 = u00Var;
        this.f39955s.addView(u00Var, w7.z5.c(-1.0f, -1));
        u5 y3 = u5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f52363g0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f52363g0.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), false, true, false);
        this.f52365i0 = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        this.f52365i0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f52365i0.setGravity(17);
        this.f52365i0.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.resourceProvider));
        this.f52364h0 = new SpannableStringBuilder("S");
        w70 w70Var = new w70(this.f52365i0, 42.0f, this.currentAccount);
        kj0 kj0Var = new kj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = w70Var.f41962b;
        imageReceiver.setImageBitmap(kj0Var);
        imageReceiver.setAutoRepeat(2);
        w70Var.f41965f = false;
        w70Var.h = -AndroidUtilities.dp(3.0f);
        this.f52364h0.setSpan(w70Var, 0, 1, 33);
        this.f52363g0.addView(this.f52365i0, w7.z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.f52366j0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f52366j0.setGravity(17);
        this.f52366j0.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.f52366j0.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, this.resourceProvider));
        this.f52363g0.addView(this.f52366j0, w7.z5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        rg.j1 j1Var = new rg.j1(this, getParentActivity(), 3);
        this.f52368l0 = j1Var;
        frameLayout3.addView(j1Var);
        ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar;
        dVar.e();
        this.m0.g("", false, true);
        this.m0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f51358b;

            {
                this.f51358b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        z7.C0(this.f51358b, context);
                        return;
                    default:
                        new p7(context, this.f51358b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f52368l0.addView(this.m0, w7.z5.e(-1, 48, 119));
        vb1 vb1Var = new vb1(this, getParentActivity(), 20);
        this.f52369n0 = vb1Var;
        frameLayout3.addView(vb1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.f52370o0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new rq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f52370o0.g(spannableStringBuilder, false, true);
        this.f52370o0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f51358b;

            {
                this.f51358b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        z7.C0(this.f51358b, context);
                        return;
                    default:
                        new p7(context, this.f51358b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f52369n0.addView(this.f52370o0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.f52367k0 = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new rq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.f52367k0.g(spannableStringBuilder2, false, true);
        this.f52367k0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f51437b;

            {
                this.f51437b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z7 z7Var = this.f51437b;
                        z7Var.presentFragment(new h(0, z7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        z7.D0(this.f51437b);
                        return;
                }
            }
        });
        this.f52369n0.addView(this.f52367k0, w7.z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f52363g0.addView(frameLayout3, w7.z5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ci.d dVar4 = new ci.d(getParentActivity(), this.resourceProvider, false);
        this.f52371p0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new rq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f52371p0.g(spannableStringBuilder3, false, true);
        this.f52371p0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f51437b;

            {
                this.f51437b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z7 z7Var = this.f51437b;
                        z7Var.presentFragment(new h(0, z7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        z7.D0(this.f51437b);
                        return;
                }
            }
        });
        this.f52363g0.addView(this.f52371p0, w7.z5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        r1();
        d7 d7Var = this.f52374s0;
        if (d7Var != null) {
            d7Var.N(false);
        }
        p.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        s1((y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        if (i10 == i12 || i10 == NotificationCenter.starSubscriptionsLoaded || i10 == NotificationCenter.starOptionsLoaded) {
            q1("NOTIFICATION_" + i10);
        }
        if (i10 == NotificationCenter.starOptionsLoaded) {
            w0();
            d7 d7Var = this.f52374s0;
            if (d7Var != null) {
                d7Var.N(true);
            }
            l0();
        } else if (i10 == i12) {
            u5 y3 = u5.y(this.currentAccount, false);
            if (this.f52372q0 != y3.O(0)) {
                this.f52372q0 = y3.O(0);
                w0();
                d7 d7Var2 = this.f52374s0;
                if (d7Var2 != null) {
                    d7Var2.N(false);
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d7 d7Var3 = this.f52374s0;
            if (d7Var3 != null) {
                d7Var3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            r1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            r1();
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        bw0 bw0Var = this.S;
        if (bw0Var == null || motionEvent == null || bw0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.S.c() || this.R.f52331b.f27166b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void l0() {
        bw0 bw0Var;
        q1("RESTORE_BEFORE");
        super.l0();
        if (this.f52359c0 && (bw0Var = this.S) != null && this.Y != -1) {
            bw0Var.a();
        }
        this.f52359c0 = false;
        q1("RESTORE_AFTER");
    }

    @Override
    public final void m0() {
        this.f39955s.addView(this.S, w7.z5.c(-1.0f, -1));
        this.S.u(this.f39950c, new j6(this, 3));
        bw0 bw0Var = this.S;
        y7 y7Var = this.R;
        bw0Var.x(y7Var, y7Var.f52331b, new u2.l0(24));
        this.S.y(this.R.d);
        this.R.d.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        M0();
    }

    @Override
    public final s4.h0 o0() {
        d7 d7Var = new d7(this, this.f39950c, getParentActivity(), this.currentAccount, this.classGuid, new hi.a(this, 27), getResourceProvider());
        this.f52374s0 = d7Var;
        d7Var.f32531r = false;
        return d7Var;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        u5.y(this.currentAccount, false).T(true);
        u5.y(this.currentAccount, false).S();
        u5.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        zl0 zl0Var = this.f39950c;
        if (zl0Var != null) {
            zl0Var.removeCallbacks(this.f52360d0);
        }
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f52358b0 = true;
        this.Z = i11;
        this.f52357a0 = i13;
        M0();
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
    public final s4.c0 p0(Context context) {
        bw0 bw0Var = this.S;
        bw0Var.getClass();
        return new gg.j0(5, bw0Var, false);
    }

    @Override
    public final rg.y1 q0() {
        return new c7(getParentActivity(), 75, 1);
    }

    public final void q1(String str) {
        boolean z10;
        int top;
        int height;
        if (this.S != null) {
            StringBuilder w10 = a4.a.w("Stars event=", str, " row=");
            w10.append(this.Y);
            w10.append(" hasTransactions=");
            w10.append(this.f52372q0);
            w10.append(" savedPosition=");
            w10.append(this.N);
            w10.append(" savedOffset=");
            w10.append(this.O);
            w10.append(" savedPinned=");
            w10.append(this.f52359c0);
            w10.append(" boundaryAttached=");
            ab abVar = this.T;
            if (abVar != null && abVar.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.append(z10);
            w10.append(" boundaryTop=");
            ab abVar2 = this.T;
            if (abVar2 == null) {
                top = 0;
            } else {
                top = abVar2.getTop();
            }
            w10.append(top);
            w10.append(" boundaryHeight=");
            ab abVar3 = this.T;
            if (abVar3 == null) {
                height = 0;
            } else {
                height = abVar3.getHeight();
            }
            w10.append(height);
            Log.d("SiblingScroll", w10.toString());
            bw0 bw0Var = this.S;
            if (!bw0Var.f25117a) {
                return;
            }
            bw0Var.f25119b = Math.max(bw0Var.f25119b, Math.min(60, Math.max(0, 30)));
            bw0Var.f(str, null, 0, 0, true);
        }
    }

    public final void r1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        u5 y3 = u5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f52364h0);
        spannableStringBuilder.append((CharSequence) P0(y3.p(), 0.66f, ' '));
        this.f52365i0.setText(spannableStringBuilder);
        ci.d dVar = this.m0;
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
        s1(z10, true);
    }

    @Override
    public final View s0(Context context) {
        throw null;
    }

    public final void s1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f52373r0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.f52368l0.setVisibility(0);
            this.f52369n0.setVisibility(0);
            ViewPropertyAnimator animate = this.f52368l0.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final z7 f51465b;

                {
                    this.f51465b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f51465b.f52368l0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f51465b.f52369n0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f52369n0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final z7 f51465b;

                {
                    this.f51465b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f51465b.f52368l0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f51465b.f52369n0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f52368l0.animate().cancel();
        this.f52369n0.animate().cancel();
        vb1 vb1Var = this.f52369n0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        vb1Var.setAlpha(f7);
        rg.j1 j1Var = this.f52368l0;
        if (z10) {
            f11 = 0.0f;
        }
        j1Var.setAlpha(f11);
        vb1 vb1Var2 = this.f52369n0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        vb1Var2.setVisibility(i10);
        rg.j1 j1Var2 = this.f52368l0;
        if (z10) {
            i11 = 8;
        }
        j1Var2.setVisibility(i11);
    }

    @Override
    public final float t0() {
        zl0 zl0Var = this.f39950c;
        if (zl0Var == null) {
            return 0.0f;
        }
        return zl0Var.getY();
    }

    public final void t1() {
        if (this.U == null) {
            return;
        }
        int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.Z;
        ViewGroup.LayoutParams layoutParams = this.U.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.U.setLayoutParams(layoutParams);
        }
        u1();
    }

    @Override
    public final View u0() {
        return this.S;
    }

    public final void u1() {
        float f7;
        View view = this.U;
        if (view == null) {
            return;
        }
        le.b bVar = this.V;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.f15436e;
        }
        le.b bVar2 = this.W;
        if (bVar2 != null) {
            f10 = bVar2.f15436e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    @Override
    public final void v0(boolean z10) {
        le.b bVar = this.X;
        if (bVar != null && bVar.f15437f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public final void w0() {
        boolean z10;
        q1("SAVE_BEFORE");
        super.w0();
        bw0 bw0Var = this.S;
        if (bw0Var != null && bw0Var.f25125e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52359c0 = z10;
        zl0 zl0Var = this.f39950c;
        if (zl0Var != null && this.N >= 0) {
            this.O -= zl0Var.getPaddingTop();
        }
        q1("SAVE_AFTER");
    }
}
