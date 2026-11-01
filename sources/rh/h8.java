package rh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.jc;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.br;
import org.telegram.ui.g51;
import org.telegram.ui.n10;
import org.telegram.ui.n60;
import org.telegram.ui.o10;
import org.telegram.ui.oo;
import org.telegram.ui.s71;
import org.telegram.ui.un;
import w7.b9;
public final class h8 extends o10 implements vs {
    public static DecimalFormat f47025v0;
    public static DecimalFormat f47026w0;
    public FrameLayout R;
    public lg.q S;
    public g8 T;
    public lu0 U;
    public bi.t0 V;
    public View W;
    public fe.b X;
    public fe.b Y;
    public fe.b Z;
    public int f47028b0;
    public int f47029c0;
    public boolean f47030d0;
    public boolean f47031e0;
    public bo0 f47033g0;
    public xz f47034h0;
    public LinearLayout f47035i0;
    public SpannableStringBuilder f47036j0;
    public org.telegram.ui.Components.f6 f47037k0;
    public TextView f47038l0;
    public vh.d m0;
    public org.telegram.ui.Components.voip.j0 f47039n0;
    public vh.d f47040o0;
    public s71 f47041p0;
    public vh.d f47042q0;
    public vh.d f47043r0;
    public boolean f47044s0;
    public boolean f47045t0;
    public ph.o3 f47046u0;
    public int f47027a0 = -1;
    public final ph.x1 f47032f0 = new ph.x1(this, 22);

    public h8() {
        this.M = true;
    }

    public static void A0(h8 h8Var, Context context) {
        if (wp.r1(h8Var.currentAccount).u2()) {
            org.telegram.ui.b.b(h8Var.currentAccount);
        } else {
            new y7(context, h8Var.resourceProvider).show();
        }
    }

    public static void B0(h8 h8Var) {
        e6.y(h8Var.currentAccount, false).u();
        mg.i2.l1(1, org.telegram.messenger.y1.a(h8Var.currentAccount).b());
    }

    public static void C0(rh.h8 r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: rh.h8.C0(rh.h8, int):void");
    }

    public static void D0(h8 h8Var, b51 b51Var, Boolean bool, String str) {
        if (h8Var.getParentActivity() != null) {
            if (bool.booleanValue()) {
                cc.a0(h8Var).I(2131624224, dd.L0(2131745177, null), org.telegram.messenger.i0.W2(dd.G((int) b51Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                h8Var.f47034h0.c(true);
                e6.y(h8Var.currentAccount, false).S(true);
            } else if (str != null) {
                cc.a0(h8Var).Q(2131624011, 36, dd.a0(null, null, 2131743903, str)).j();
            }
        }
    }

    public static void H0(xy0 xy0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.p6 p6Var) {
        CharSequence K;
        CharSequence charSequence;
        TextView textView = (TextView) ((uy0) xy0Var.c(dd.L0(2131750309, null), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        u80 u80Var = new u80(textView, org.telegram.messenger.i0.L(90.0f), 0, p6Var);
        u80Var.a(org.telegram.ui.ActionBar.t6.r1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.t6.r1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(u80Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final e6 y3 = e6.y(i10, false);
            final long j10 = starGift.f20022id;
            final ph.h1 h1Var = new ph.h1(textView, 13);
            final boolean[] zArr = {false};
            final vs[] vsVarArr = {new vs() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    e6 e6Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = at.F3) && (J = (e6Var = e6.this).J(j10)) != null) {
                        zArr2[0] = true;
                        at.f(e6Var.f46863a).n(vsVarArr[0], i13);
                        h1Var.a(J);
                    }
                }
            }};
            int i11 = y3.f46863a;
            at f7 = at.f(i11);
            vs vsVar = vsVarArr[0];
            int i12 = at.F3;
            f7.b(vsVar, i12);
            TL_stars.StarGift J = y3.J(j10);
            if (J != null) {
                zArr[0] = true;
                at.f(i11).n(vsVarArr[0], i12);
                h1Var.a(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = dd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = dd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + dd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i13 = starGift.availability_remains;
            if (i13 <= 0) {
                K = dd.H(',', "Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                K = dd.K("Gift2Availability4Value", i13, ',', dd.E(starGift.availability_total, ','));
            }
            textView.setText(K);
        }
    }

    public static void I0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new m7(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        return M0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f47026w0 == null) {
            f47026w0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j10 = starsAmount.amount;
            if (j10 % 1000000000 != 0) {
                String format = f47026w0.format(j10 / 1.0E9d);
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
                sb2.append(dd.E(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j11 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j11 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 > 0 && j11 < 0) {
                d = 1.0E9d;
                i10 = 1;
            } else {
                d = 1.0E9d;
                i10 = 0;
            }
            long j12 = i10 + j11;
            int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i12 != 0 ? i12 < 0 : i11 < 0) {
                z10 = true;
            }
            if (i11 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(dd.E(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f47026w0;
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
                sb4.append(dd.E(Math.abs(j12), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder N0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        boolean z10;
        if (f47026w0 == null) {
            f47026w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f47026w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
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
            } else {
                z10 = false;
            }
            String str = "";
            if (Math.abs(j11) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(dd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f47026w0;
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
                sb3.append(dd.E(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(org.telegram.messenger.i0.o0((int) Math.abs(j11), 0));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder O0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f47026w0 == null) {
                f47026w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f47026w0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
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
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str = "-";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(dd.E(Math.abs(j11), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f47026w0 == null) {
                f47026w0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f47026w0;
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
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.L0(2131745102, null));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) dd.H(',', "Stars", (int) j10));
        return spannableStringBuilder;
    }

    public static String P0(long j10) {
        String str;
        if (f47025v0 == null) {
            f47025v0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j10 % 1000000000 != 0) {
            return f47025v0.format(j10 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(dd.E(Math.abs(j10 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String Q0(int r6, boolean r7, org.telegram.tgnet.tl.TL_stars.StarsTransaction r8) {
        throw new UnsupportedOperationException("Method not decompiled: rh.h8.Q0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f7) {
        return S0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, float f10, float f11) {
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
        dq dqVar = new dq(2131231054, 0);
        dqVar.d = false;
        dqVar.f25568r = 0.0f;
        dqVar.f25569s = f10;
        dqVar.G = f11;
        dqVar.H = f7;
        dqVar.I = f7;
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "💎", "💎️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "💎", "💎 ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "💎");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder T0(CharSequence charSequence) {
        return U0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder U0(CharSequence charSequence, float f7, dq[] dqVarArr) {
        return X0(false, charSequence, f7, dqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(CharSequence charSequence, boolean z10) {
        return X0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f7, dq[] dqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        dq dqVar;
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
        if (dqVarArr == null || (dqVar = dqVarArr[0]) == null) {
            if (z10) {
                i10 = 2131231956;
            } else {
                i10 = 2131232306;
            }
            dqVar = new dq(i10, 0);
            if (dqVarArr != null) {
                dqVarArr[0] = dqVar;
            }
        }
        dqVar.f25568r = 0.0f;
        dqVar.f25569s = f10;
        dqVar.G = f11;
        if (z10) {
            dqVar.d = false;
            float f12 = f7 * 0.2f;
            dqVar.H = f12;
            dqVar.I = f12;
        } else {
            dqVar.H = f7;
            dqVar.I = f7;
        }
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Y0(boolean z10, String str, dq[] dqVarArr) {
        dq dqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (dqVarArr == null || (dqVar = dqVarArr[0]) == null) {
            if (z10) {
                i10 = 2131231956;
            } else {
                i10 = 2131232306;
            }
            dqVar = new dq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            dqVar.H = f7;
            dqVar.I = f10;
        }
        if (z10) {
            dqVar.d = false;
        }
        if (dqVarArr != null) {
            dqVarArr[0] = dqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Z0(TL_stars.StarsAmount starsAmount, String str, dq[] dqVarArr) {
        return a1(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, dqVarArr);
    }

    public static SpannableStringBuilder a1(boolean z10, CharSequence charSequence, float f7, dq[] dqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        dq dqVar;
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
            i10 = 2131231956;
        } else {
            i10 = 2131232749;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (dqVarArr == null || (dqVar = dqVarArr[0]) == null) {
            if (dqVarArr != null && dqVarArr.length > 0) {
                dqVar = new dq(i10, 0);
                dqVarArr[0] = dqVar;
            } else {
                dqVar = new dq(i10, 0);
            }
        }
        dqVar.d = false;
        if (z10) {
            f7 *= 0.33f;
        }
        dqVar.H = f7;
        dqVar.I = f7;
        spannableString.setSpan(dqVar, 0, spannableString.length() - 1, 33);
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐️");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "⭐", "⭐ ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "⭐");
        org.telegram.messenger.i0.L2(spannableStringBuilder, "XTR", "XTR ");
        org.telegram.messenger.i0.L2(spannableStringBuilder, spannableString, "XTR");
        return spannableStringBuilder;
    }

    public static e01 b1(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i10;
        int i11 = imageReceiver.d;
        final ig.o0 o0Var = new ig.o0(z10, i11, str, imageReceiver, new boolean[1]);
        o0Var.run();
        at f7 = at.f(i11);
        if (z10) {
            i10 = at.X2;
        } else {
            i10 = at.W2;
        }
        return new e01(f7.h(view, i10, new r20() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        o0Var.run();
                        return;
                    default:
                        o0Var.run();
                        return;
                }
            }
        }), at.f(i11).h(view, at.f14821y0, new r20() {
            @Override
            public final void a(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        o0Var.run();
                        return;
                    default:
                        o0Var.run();
                        return;
                }
            }
        }), 1);
    }

    public static void c1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, i10, false, null, false);
        imageReceiver.r0(jc.b(document), a1.g.i(i10, i10, "_"), jc.c(w9, document), a1.g.i(i10, i10, "_"), org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f20873a7, 0.35f, false), 0L, null, null, 0);
    }

    public static void d1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        c1(imageReceiver, document, i10);
    }

    public static void e1(g9 g9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 1000) {
            str = "2⃣";
        } else if (j10 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        b1(g9Var, imageReceiver, str, false);
    }

    public static e01 f1(g9 g9Var, ImageReceiver imageReceiver, int i10) {
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
        return b1(g9Var, imageReceiver, str, false);
    }

    public static void g1(g9 g9Var, ImageReceiver imageReceiver, long j10) {
        String str;
        if (j10 <= 10000000000L) {
            str = "2⃣";
        } else if (j10 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        b1(g9Var, imageReceiver, str, true);
    }

    public static void h1(Context context, int i10, long j10, TL_stories.Boost boost, org.telegram.ui.ActionBar.p6 p6Var) {
        ?? r18;
        org.telegram.ui.ActionBar.z2[] z2VarArr;
        xy0 xy0Var;
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        org.telegram.ui.ActionBar.z2[] z2VarArr2 = new org.telegram.ui.ActionBar.z2[1];
        ?? f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(0, org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.b6.t(-1, 150, 7, 0, 0, 0, 10));
        o7 o7Var = new o7(context, 70, 0, 0);
        frameLayout.addView(o7Var, w7.b6.c(-1.0f, -1));
        lg.q qVar = new lg.q(context, 1, 2);
        lg.h hVar = qVar.f11920b;
        hVar.f11898z = org.telegram.ui.ActionBar.t6.Tk;
        hVar.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar.b();
        qVar.setStarParticlesView(o7Var);
        frameLayout.addView(qVar, w7.b6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        qVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.messenger.m5.m(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(dd.H(' ', "BoostStars", (int) boost.stars));
        ?? f10 = a30.f(f7, textView, w7.b6.t(-1, -2, 17, 20, 0, 20, 4), context);
        f10.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), -6915073));
        f10.setTextColor(-1);
        f10.setTextSize(1, 11.33f);
        f10.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(8.33f), 0);
        f10.setGravity(17);
        f10.setTypeface(org.telegram.messenger.i0.o());
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = boost.multiplier;
        if (i11 == 0) {
            i11 = 1;
        }
        sb2.append(dd.H(' ', "BoostingBoostsCount", i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        dq dqVar = new dq(2131231927, 2);
        dqVar.f25568r = 0.0f;
        dqVar.f25569s = org.telegram.messenger.i0.L(0.66f);
        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
        f10.setText(spannableStringBuilder);
        f7.addView(f10, w7.b6.t(-2, 20, 17, 20, 4, 20, 4));
        xy0 xy0Var2 = new xy0(context, p6Var);
        xy0Var2.n(dd.L0(2131753627, null), i10, j10, new m6(z2VarArr2, j10, 6));
        xy0Var2.c(dd.L0(2131753626, null), dd.G((int) boost.stars, "BoostStars", new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            z2VarArr = z2VarArr2;
            xy0Var = xy0Var2;
            r18 = 0;
            xy0Var.i(dd.L0(2131753615, null), dd.L0(2131753614, null), new a3.i0(z2VarArr, j10, boost, 26));
        } else {
            r18 = 0;
            z2VarArr = z2VarArr2;
            xy0Var = xy0Var2;
        }
        String L0 = dd.L0(2131753662, null);
        String format = dd.D0().r0().format(new Date(boost.date * 1000));
        String format2 = dd.D0().o0().format(new Date(boost.date * 1000));
        Object[] objArr = new Object[2];
        objArr[r18] = format;
        objArr[1] = format2;
        xy0Var.c(L0, dd.a0(null, null, 2131742808, objArr), null, null);
        String L02 = dd.L0(2131753607, null);
        String format3 = dd.D0().r0().format(new Date(boost.expires * 1000));
        xy0 xy0Var3 = xy0Var;
        String format4 = dd.D0().o0().format(new Date(boost.expires * 1000));
        Object[] objArr2 = new Object[2];
        objArr2[r18] = format3;
        objArr2[1] = format4;
        xy0Var3.c(L02, dd.a0(null, null, 2131742808, objArr2), null, null);
        f7.addView(xy0Var3, w7.b6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        p80 p80Var = new p80(context, p6Var);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setText(org.telegram.messenger.i0.T2(dd.L0(2131744944, null), new ph.p0(context, 6)));
        p80Var.setGravity(17);
        f7.addView(p80Var, w7.b6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.i(dd.L0(2131747847, null), r18, true);
        dVar.setOnClickListener(new p6(z2VarArr, 1));
        f7.addView(dVar, w7.b6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        k10.N = f7;
        z2VarArr[0] = k10;
        k10.T0 = false;
        k10.O();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(T)) {
            z2VarArr[0].a0(T);
        }
        qVar.setPaused(false);
        z2VarArr[0].show();
        z2VarArr[0].n(new ph.x1(qVar, 23));
    }

    public static i0 i1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, k20 k20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        sf.a resellAmount;
        sf.b bVar = sf.b.f48267a;
        if (tL_starGiftUnique == null) {
            resellAmount = sf.a.g(((org.telegram.messenger.l0) wp.r1(i10).f19300y7.f18042p.f10701a).f16855c, bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(sf.b.f48268b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        i0 i0Var = new i0(context, p6Var, i10, resellAmount, new q2(2, k20Var, r8));
        i0[] i0VarArr = {i0Var};
        i0Var.show();
        return i0VarArr[0];
    }

    public static void j1(Context context, long j10, boolean z10, final k20 k20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.z2[] z2VarArr;
        long j11;
        boolean z11 = false;
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.i0.o());
        vh.d dVar = null;
        textView.setText(dd.L0(2131747748, null));
        textView.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i12, p6Var);
        linearLayout.addView(textView, w7.b6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        ec0 ec0Var = new ec0(context, p6Var);
        ec0Var.setForceForceUseCenter(true);
        ec0Var.setText(dd.L0(2131747749, null));
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(36.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, p6Var);
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int L = org.telegram.messenger.i0.L(16.0f);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(6.0f), L, L, L);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        org.telegram.ui.ActionBar.a7.D(editTextBoldCursor, org.telegram.ui.ActionBar.t6.f21029ig, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 36, org.telegram.ui.ActionBar.t6.f21049jg, p6Var);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new g51(ec0Var, editTextBoldCursor, 1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232749);
        linearLayout2.addView(imageView, w7.b6.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.b6.p(-1, -2, 1.0f, 119));
        ec0Var.e(editTextBoldCursor);
        ec0Var.addView(linearLayout2, w7.b6.e(-1, -2, 48));
        linearLayout.addView(ec0Var, w7.b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.A6, null);
        ec0Var.addView(textView2, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        p80 p80Var = new p80(context, null);
        p80Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(dd.L0(2131747751, null), new ph.p0(context, 7)), true));
        p80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        linearLayout.addView(p80Var, w7.b6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final vh.d i13 = a30.i(24, context, p6Var, true);
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 > 0) {
            i11 = 2131747747;
        } else {
            i11 = 2131747753;
        }
        i13.i(dd.L0(i11, null), false, true);
        linearLayout.addView(i13, w7.b6.o(-1, 48));
        if (i14 > 0 && z10) {
            vh.d i15 = a30.i(24, context, p6Var, false);
            i15.i(dd.L0(2131747752, null), false, false);
            linearLayout.addView(i15, w7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
            dVar = i15;
        }
        k10.N = linearLayout;
        final org.telegram.ui.ActionBar.z2[] z2VarArr2 = {k10};
        if (i14 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j10);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new n7(editTextBoldCursor, ec0Var, j10, z10, i13, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                if (i16 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                i13.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                k20Var.a(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new w6(editTextBoldCursor2, z2VarArr2, 1));
                return true;
            }
        });
        u6 u6Var = new u6(zArr, k20Var, editTextBoldCursor, i13, z2VarArr2);
        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
        i13.setOnClickListener(u6Var);
        if (dVar != null) {
            vh.d dVar2 = dVar;
            u6 u6Var2 = new u6(zArr, k20Var, dVar2, editTextBoldCursor2, z2VarArr2);
            editTextBoldCursor2 = editTextBoldCursor2;
            z2VarArr = z2VarArr2;
            dVar2.setOnClickListener(u6Var2);
        } else {
            z2VarArr = z2VarArr2;
        }
        z2VarArr[0].O();
        z2VarArr[0].setOnDismissListener(new ag.x(editTextBoldCursor2, 11));
        z2VarArr[0].show();
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            z11 = ((un) Q).ka();
        }
        w6 w6Var = new w6(z2VarArr, editTextBoldCursor2);
        if (z11) {
            j11 = 200;
        } else {
            j11 = 80;
        }
        org.telegram.messenger.i0.h3(w6Var, j11);
    }

    public static org.telegram.ui.ActionBar.z2 k1(final android.content.Context r61, final boolean r62, final long r63, final int r65, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r66, final org.telegram.ui.ActionBar.p6 r67) {
        throw new UnsupportedOperationException("Method not decompiled: rh.h8.k1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.p6):org.telegram.ui.ActionBar.z2");
    }

    public static void l1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.p6 p6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f20024id = tL_messageActionPaymentRefunded.charge.f19924id;
        starsTransaction.refund = true;
        k1(activity, false, 0L, i10, starsTransaction, p6Var);
    }

    public static void m1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.p6 p6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = wp.r1(i10).y1(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f20024id = tL_payments_paymentReceiptStars.transaction_id;
        k1(context, false, 0L, i10, starsTransaction, p6Var);
    }

    public static CharSequence s1(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        dq[] dqVarArr;
        x4.o c10;
        if (z10 && c3.i0.t(spannableStringBuilder)) {
            for (dq dqVar : (dq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dq.class)) {
                Drawable drawable = dqVar.f25565c;
                if (drawable != null && !(drawable instanceof x4.o) && (c10 = x4.o.c(org.telegram.messenger.w0.f18945b.getResources(), 2131231957, null)) != null) {
                    c10.setBounds(dqVar.f25565c.getBounds());
                    dqVar.f25565c = c10;
                    dqVar.d = false;
                }
            }
        }
        return spannableStringBuilder;
    }

    public final void J0() {
        q1();
        uk0 uk0Var = this.f40007c;
        if (uk0Var != null && this.U != null && uk0Var.getLayoutParams() != null) {
            int C = a30.C(48.0f, this.f47028b0, -org.telegram.messenger.i0.L(8.0f));
            int C2 = a30.C(48.0f, this.f47029c0, -org.telegram.messenger.i0.L(8.0f));
            org.telegram.messenger.i0.A3(this.f40007c, 0, C, 0, C2);
            uk0 uk0Var2 = this.f40007c;
            int i10 = -C;
            uk0Var2.setPadding(uk0Var2.getPaddingLeft(), i10, this.f40007c.getPaddingRight(), this.f47029c0 - C2);
            this.U.z(i10, -C2);
        }
    }

    public final void K0(ArrayList arrayList, q51 q51Var) {
        boolean z10;
        uk0 uk0Var;
        int i10;
        n1("FILL_BEFORE");
        lu0 lu0Var = this.U;
        if (lu0Var != null && lu0Var.f28276e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47027a0 = -1;
        if (getParentActivity() == null) {
            return;
        }
        e6 y3 = e6.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        b51 b51Var = new b51(-2);
        b51Var.f24637c = (bi.t0) super.o0(getParentActivity());
        arrayList.add(b51Var);
        arrayList.add(b51.k(this.f47035i0));
        vh.d dVar = this.f47043r0;
        if (dVar != null) {
            if (getMessagesController().Y5) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(b51.C(null));
        if (getMessagesController().f19146h6) {
            arrayList.add(xh.e.i(-4, getThemedColor(org.telegram.ui.ActionBar.t6.ik), oo.i0(dd.L0(2131743792, null)), dd.L0(2131743793, null)));
            arrayList.add(b51.C(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            arrayList.add(b51.u(dd.L0(2131745221, null)));
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = z7.f47837b;
                b51 K = b51.K(z7.class);
                K.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(K);
            }
            if (y3.f46882x) {
                arrayList.add(b51.q(arrayList.size(), 33));
            } else if (!y3.f46883y) {
                b51 c10 = b51.c(-3, 2131230871, dd.L0(2131745220, null));
                c10.f24648q = true;
                arrayList.add(c10);
            }
            arrayList.add(b51.C(null));
        }
        boolean N = y3.N(0);
        this.f47044s0 = N;
        if (N) {
            this.f47027a0 = arrayList.size();
            arrayList.add(b51.n(this.V, -2));
            if (z10 && (uk0Var = this.f40007c) != null) {
                ph.x1 x1Var = this.f47032f0;
                uk0Var.removeCallbacks(x1Var);
                this.f40007c.post(x1Var);
            }
        } else {
            arrayList.add(b51.m(this.f47033g0));
        }
        n1("FILL_AFTER");
    }

    @Override
    public final View createView(final Context context) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10;
        this.G = false;
        this.E = org.telegram.messenger.i0.L(238.0f);
        lu0 lu0Var = new lu0(context);
        this.U = lu0Var;
        boolean z11 = true;
        lu0Var.setDebugLoggingEnabled(true);
        this.U.setCommonInsetsManagedExternally(true);
        if (!this.f47030d0) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
                i10 = 0;
            } else {
                i10 = org.telegram.messenger.i0.f16166m;
            }
            this.f47028b0 = i10;
            this.f47029c0 = org.telegram.messenger.i0.f16167n;
        }
        this.U.setGeometry(new m2.t(this, 21));
        this.U.z(-a30.C(48.0f, this.f47028b0, -org.telegram.messenger.i0.L(8.0f)), -a30.C(48.0f, this.f47029c0, -org.telegram.messenger.i0.L(8.0f)));
        lu0 lu0Var2 = this.U;
        lu0Var2.getClass();
        this.V = new bi.t0(lu0Var2, context, 20);
        this.T = new g8(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f47033g0 = new bo0(this, context, 9);
        super.createView(context);
        n10 n10Var = this.f40011s;
        getBaseSimpleGlass().f(n10Var, this.f40007c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f6606m = this.U;
        this.f40007c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f6607n = new ei.a(8, this, new org.telegram.ui.ActionBar.y1(2, n10Var));
        FrameLayout frameLayout = this.T.d;
        View view = new View(getParentActivity());
        this.W = view;
        view.setAlpha(0.0f);
        lu0 lu0Var3 = this.U;
        lu0Var3.addView(this.W, lu0Var3.indexOfChild(frameLayout), w7.b6.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        i6 i6Var = new i6(this, 0);
        gr grVar = gr.h;
        fe.b bVar = new fe.b(0, i6Var, grVar, 380L, false);
        this.X = bVar;
        this.Y = new fe.b(1, new i6(this, 1), grVar, 380L, false);
        this.Z = new fe.b(2, new i6(this, 2), grVar, 380L, false);
        if (!this.f40007c.canScrollVertically(-1) && !this.simpleActionBar.s()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar.a(z10, false);
        this.Y.a(this.U.f28276e0, false);
        this.f40007c.j(new cu0(this, 19));
        q1();
        vg.f c10 = getBaseSimpleGlass().f6599c.c(frameLayout, null, false);
        c10.o(b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
        if (z4Var2 != null && ((ActionBarLayout) z4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        frameLayout2.setClickable(true);
        lg.q qVar = new lg.q(context, 1, 2);
        this.S = qVar;
        lg.h hVar = qVar.f11920b;
        hVar.f11898z = org.telegram.ui.ActionBar.t6.Tk;
        hVar.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar.b();
        this.S.setStarParticlesView(this.e);
        this.R.addView(this.S, w7.b6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        j0(dd.L0(2131744240, null), org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(dd.L0(2131744237, null), new ph.p0(context, 4)), true), this.R, null);
        this.f40007c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        this.f40007c.setItemAnimator(jVar);
        this.f40007c.setOnItemClickListener(new ag.y0(this, 12));
        xz xzVar = new xz(getParentActivity());
        this.f47034h0 = xzVar;
        this.f40011s.addView(xzVar, w7.b6.c(-1.0f, -1));
        e6 y3 = e6.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f47035i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f47035i0.setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getParentActivity(), false, true, false);
        this.f47037k0 = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        this.f47037k0.setTextSize(org.telegram.messenger.i0.L(32.0f));
        this.f47037k0.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(this.f47037k0, org.telegram.ui.ActionBar.t6.G6, this.resourceProvider);
        this.f47036j0 = new SpannableStringBuilder("S");
        n60 n60Var = new n60(42.0f, this.currentAccount, this.f47037k0);
        ci0 ci0Var = new ci0(2131624215, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f));
        ImageReceiver imageReceiver = n60Var.f39709b;
        imageReceiver.w0(ci0Var);
        imageReceiver.W(2);
        n60Var.f39711f = false;
        n60Var.h = -org.telegram.messenger.i0.L(3.0f);
        this.f47036j0.setSpan(n60Var, 0, 1, 33);
        this.f47035i0.addView(this.f47037k0, w7.b6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.f47038l0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f47038l0.setGravity(17);
        this.f47038l0.setText(dd.L0(2131742815, null));
        org.telegram.ui.ActionBar.a7.V(this.f47038l0, org.telegram.ui.ActionBar.t6.f21331z6, this.resourceProvider);
        this.f47035i0.addView(this.f47038l0, w7.b6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(getParentActivity());
        org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(this, getParentActivity(), 6);
        this.f47039n0 = j0Var;
        frameLayout3.addView(j0Var);
        vh.d dVar = new vh.d(getParentActivity(), this.resourceProvider, true);
        this.f47040o0 = dVar;
        dVar.f();
        this.f47040o0.i("", false, true);
        this.f47040o0.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f47387b;

            {
                this.f47387b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h8.A0(this.f47387b, context);
                        return;
                    default:
                        new y7(context, this.f47387b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f47039n0.addView(this.f47040o0, w7.b6.e(-1, 48, 119));
        s71 s71Var = new s71(this, getParentActivity(), 23);
        this.f47041p0 = s71Var;
        frameLayout3.addView(s71Var);
        vh.d dVar2 = new vh.d(getParentActivity(), this.resourceProvider, true);
        this.f47042q0 = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new dq(2131231976, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) dd.L0(2131744983, null));
        this.f47042q0.i(spannableStringBuilder, false, true);
        this.f47042q0.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f47387b;

            {
                this.f47387b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r3) {
                    case 0:
                        h8.A0(this.f47387b, context);
                        return;
                    default:
                        new y7(context, this.f47387b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f47041p0.addView(this.f47042q0, w7.b6.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        vh.d dVar3 = new vh.d(getParentActivity(), this.resourceProvider, true);
        this.m0 = dVar3;
        dVar3.f();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new dq(2131231972, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) dd.L0(2131745040, null));
        this.m0.i(spannableStringBuilder2, false, true);
        this.m0.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f47603b;

            {
                this.f47603b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h8 h8Var = this.f47603b;
                        h8Var.presentFragment(new i(0, h8Var.getUserConfig().e()));
                        return;
                    default:
                        h8.B0(this.f47603b);
                        return;
                }
            }
        });
        this.f47041p0.addView(this.m0, w7.b6.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f47035i0.addView(frameLayout3, w7.b6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        vh.d dVar4 = new vh.d(getParentActivity(), this.resourceProvider, false);
        this.f47043r0 = dVar4;
        dVar4.f();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new dq(2131231890, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) dd.L0(2131744238, null));
        this.f47043r0.i(spannableStringBuilder3, false, true);
        this.f47043r0.setOnClickListener(new View.OnClickListener(this) {
            public final h8 f47603b;

            {
                this.f47603b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h8 h8Var = this.f47603b;
                        h8Var.presentFragment(new i(0, h8Var.getUserConfig().e()));
                        return;
                    default:
                        h8.B0(this.f47603b);
                        return;
                }
            }
        });
        this.f47035i0.addView(this.f47043r0, w7.b6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        o1();
        ph.o3 o3Var = this.f47046u0;
        if (o3Var != null) {
            o3Var.O(false);
        }
        r.g(this.currentAccount).r(getUserConfig().e());
        TLRPC.TL_payments_starsRevenueStats h = r.g(this.currentAccount).h(getUserConfig().e(), false);
        if (y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z11 = false;
        }
        p1(z11, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.f14803v3;
        int i13 = at.A3;
        int i14 = at.f14830z3;
        if (i10 == i14 || i10 == i13 || i10 == i12) {
            n1("NOTIFICATION_" + i10);
        }
        if (i10 == i12) {
            u0();
            ph.o3 o3Var = this.f47046u0;
            if (o3Var != null) {
                o3Var.O(true);
            }
            h0();
        } else if (i10 == i14) {
            e6 y3 = e6.y(this.currentAccount, false);
            if (this.f47044s0 != y3.N(0)) {
                this.f47044s0 = y3.N(0);
                u0();
                ph.o3 o3Var2 = this.f47046u0;
                if (o3Var2 != null) {
                    o3Var2.O(false);
                }
                h0();
            }
        } else if (i10 == i13) {
            ph.o3 o3Var3 = this.f47046u0;
            if (o3Var3 != null) {
                o3Var3.O(true);
            }
        } else if (i10 == at.y3) {
            o1();
        } else if (i10 == at.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            o1();
        }
    }

    @Override
    public final void h0() {
        lu0 lu0Var;
        n1("RESTORE_BEFORE");
        super.h0();
        if (this.f47031e0 && (lu0Var = this.U) != null && this.f47027a0 != -1) {
            lu0Var.a();
        }
        this.f47031e0 = false;
        n1("RESTORE_AFTER");
    }

    @Override
    public final void i0() {
        this.f40011s.addView(this.U, w7.b6.c(-1.0f, -1));
        this.U.u(this.f40007c, new i6(this, 3));
        lu0 lu0Var = this.U;
        g8 g8Var = this.T;
        lu0Var.x(g8Var, g8Var.f46997b, new x6(0));
        this.U.y(this.T.d);
        this.T.d.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        J0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        lu0 lu0Var = this.U;
        if (lu0Var == null || motionEvent == null || lu0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.f46997b.f32493b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final s4.g0 k0() {
        ph.o3 o3Var = new ph.o3(this, this.f40007c, getParentActivity(), this.currentAccount, this.classGuid, new qh.d(this, 8), getResourceProvider(), 1);
        this.f47046u0 = o3Var;
        o3Var.f29638r = false;
        return o3Var;
    }

    @Override
    public final s4.a0 l0(Context context) {
        lu0 lu0Var = this.U;
        lu0Var.getClass();
        return new br((Object) lu0Var, 4);
    }

    @Override
    public final kg.g2 m0() {
        return new o7(getParentActivity(), 75, 1, 0);
    }

    public final void n1(String str) {
        boolean z10;
        int top;
        int height;
        if (this.U != null) {
            StringBuilder u10 = a1.g.u("Stars event=", str, " row=");
            u10.append(this.f47027a0);
            u10.append(" hasTransactions=");
            u10.append(this.f47044s0);
            u10.append(" savedPosition=");
            u10.append(this.P);
            u10.append(" savedOffset=");
            u10.append(this.Q);
            u10.append(" savedPinned=");
            u10.append(this.f47031e0);
            u10.append(" boundaryAttached=");
            bi.t0 t0Var = this.V;
            if (t0Var != null && t0Var.getParent() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            u10.append(z10);
            u10.append(" boundaryTop=");
            bi.t0 t0Var2 = this.V;
            if (t0Var2 == null) {
                top = 0;
            } else {
                top = t0Var2.getTop();
            }
            u10.append(top);
            u10.append(" boundaryHeight=");
            bi.t0 t0Var3 = this.V;
            if (t0Var3 == null) {
                height = 0;
            } else {
                height = t0Var3.getHeight();
            }
            u10.append(height);
            Log.d("SiblingScroll", u10.toString());
            lu0 lu0Var = this.U;
            if (!lu0Var.f28269a) {
                return;
            }
            lu0Var.f28271b = Math.max(lu0Var.f28271b, Math.min(60, Math.max(0, 30)));
            lu0Var.f(str, null, 0, 0, true);
        }
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    public final void o1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        e6 y3 = e6.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f47036j0);
        spannableStringBuilder.append((CharSequence) M0(y3.p(), 0.66f, ' '));
        this.f47037k0.setText(spannableStringBuilder);
        vh.d dVar = this.f47040o0;
        if (y3.p().amount > 0) {
            i10 = 2131745168;
        } else {
            i10 = 2131745169;
        }
        dVar.i(dd.L0(i10, null), true, true);
        TLRPC.TL_payments_starsRevenueStats h = r.g(this.currentAccount).h(getUserConfig().e(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        p1(z10, true);
    }

    @Override
    public final boolean onFragmentCreate() {
        at.f(this.currentAccount).c(this, at.f14803v3);
        at.f(this.currentAccount).c(this, at.y3);
        at.f(this.currentAccount).c(this, at.f14830z3);
        at.f(this.currentAccount).c(this, at.A3);
        at.f(this.currentAccount).c(this, at.C3);
        e6.y(this.currentAccount, false).S(true);
        e6.y(this.currentAccount, false).R();
        e6.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        uk0 uk0Var = this.f40007c;
        if (uk0Var != null) {
            uk0Var.removeCallbacks(this.f47032f0);
        }
        super.onFragmentDestroy();
        at.f(this.currentAccount).n(this, at.f14803v3);
        at.f(this.currentAccount).n(this, at.y3);
        at.f(this.currentAccount).n(this, at.f14830z3);
        at.f(this.currentAccount).n(this, at.A3);
        at.f(this.currentAccount).n(this, at.C3);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f47030d0 = true;
        this.f47028b0 = i11;
        this.f47029c0 = i13;
        J0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lg.q qVar = this.S;
        if (qVar != null) {
            qVar.setPaused(true);
            this.S.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        lg.q qVar = this.S;
        if (qVar != null) {
            qVar.setPaused(false);
            this.S.setDialogVisible(false);
        }
    }

    public final void p1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f47045t0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.f47039n0.setVisibility(0);
            this.f47041p0.setVisibility(0);
            ViewPropertyAnimator animate = this.f47039n0.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final h8 f46703b;

                {
                    this.f46703b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f46703b.f47039n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f46703b.f47041p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f47041p0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final h8 f46703b;

                {
                    this.f46703b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f46703b.f47039n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f46703b.f47041p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.f47039n0.animate().cancel();
        this.f47041p0.animate().cancel();
        s71 s71Var = this.f47041p0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        s71Var.setAlpha(f7);
        org.telegram.ui.Components.voip.j0 j0Var = this.f47039n0;
        if (z10) {
            f11 = 0.0f;
        }
        j0Var.setAlpha(f11);
        s71 s71Var2 = this.f47041p0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        s71Var2.setVisibility(i10);
        org.telegram.ui.Components.voip.j0 j0Var2 = this.f47039n0;
        if (z10) {
            i11 = 8;
        }
        j0Var2.setVisibility(i11);
    }

    @Override
    public final float q0() {
        uk0 uk0Var = this.f40007c;
        if (uk0Var == null) {
            return 0.0f;
        }
        return uk0Var.getY();
    }

    public final void q1() {
        if (this.W == null) {
            return;
        }
        int L = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.f47028b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        r1();
    }

    @Override
    public final View r0() {
        return this.U;
    }

    public final void r1() {
        float f7;
        View view = this.W;
        if (view == null) {
            return;
        }
        fe.b bVar = this.X;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        fe.b bVar2 = this.Y;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - ((1.0f - f10) * org.telegram.messenger.i0.L(44.0f)));
    }

    @Override
    public final void s0(boolean z10) {
        fe.b bVar = this.Z;
        if (bVar != null && bVar.f7022f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        n1("SAVE_BEFORE");
        super.u0();
        lu0 lu0Var = this.U;
        if (lu0Var != null && lu0Var.f28276e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47031e0 = z10;
        uk0 uk0Var = this.f40007c;
        if (uk0Var != null && this.P >= 0) {
            this.Q -= uk0Var.getPaddingTop();
        }
        n1("SAVE_AFTER");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
