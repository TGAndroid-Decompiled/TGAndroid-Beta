package tf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.t;
import h7.z5;
import hh.oa;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.fe;
import org.telegram.ui.zb1;

public class e extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public Drawable D;
    public z E;
    public final c6 F;
    public final mu0 G;
    public DecimalFormat H;

    public boolean f48184a;

    public final LinearLayout f48185b;

    public t[] f48186c;
    public final TextView d;

    public final TextView f48187e;

    public final ImageView f48188f;
    public final RadialProgressView h;

    public final SimpleDateFormat f48189n;

    public final SimpleDateFormat f48190r;

    public final SimpleDateFormat f48191s;
    public final SimpleDateFormat v;

    public final SimpleDateFormat f48192w;

    public boolean f48193x;

    public boolean f48194y;

    public e(Context context, c6 c6Var) {
        super(context);
        this.f48189n = new SimpleDateFormat("E, ");
        this.f48190r = new SimpleDateFormat("MMM dd");
        this.f48191s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f48192w = new SimpleDateFormat(" HH:mm");
        this.C = true;
        this.G = new mu0(this, 6);
        this.F = c6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f48185b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f48187e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f48188f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, z5.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, z5.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, z5.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, z5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, z5.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public void b() {
        int i10 = g6.f23161j5;
        c6 c6Var = this.F;
        this.d.setTextColor(g6.v0(i10, c6Var));
        this.f48187e.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.gj;
        this.f48188f.setColorFilter(g6.v0(i11, c6Var));
        this.h.setProgressColor(g6.v0(i11, c6Var));
        this.D = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int iDp = AndroidUtilities.dp(4.0f);
        this.E = g6.i0(iDp, iDp, iDp, iDp, g6.v0(g6.f23124h5, c6Var), g6.v0(g6.f23144i6, c6Var), -16777216);
        dq dqVar = new dq(this.D, this.E, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        dqVar.f27828w = true;
        setBackground(dqVar);
    }

    public final void c(int i10, long j10, ArrayList arrayList, boolean z10, int i11, float f10) {
        int i12;
        CharSequence charSequenceX0;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int length = this.f48186c.length;
        int i19 = 2;
        int i20 = 1;
        int i21 = 0;
        if (z10) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(150L)).addTransition(new Fade(1).setDuration(150L));
            transitionSet.setOrdering(0);
            TransitionManager.beginDelayedTransition(this, transitionSet);
        }
        boolean z11 = this.f48184a;
        TextView textView = this.d;
        if (z11) {
            textView.setText(String.format(Locale.ENGLISH, "%02d:00", Long.valueOf(j10)));
        } else {
            if (this.f48193x) {
                textView.setText(this.v.format(new Date(j10)) + " — " + this.f48191s.format(new Date(604800000 + j10)));
            } else {
                Date date = new Date(j10);
                boolean z12 = this.f48194y;
                SimpleDateFormat simpleDateFormat = this.f48190r;
                textView.setText(z12 ? a(simpleDateFormat.format(date)) : a(this.f48189n.format(date)) + a(simpleDateFormat.format(date)));
            }
            if (this.f48194y) {
                this.f48187e.setText(this.f48192w.format(Long.valueOf(j10)));
            }
        }
        long j11 = 0;
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            if (((f) arrayList.get(i22)).f48206n) {
                j11 += ((f) arrayList.get(i22)).f48195a.f47874a[i10];
            }
        }
        int i23 = 0;
        while (i23 < length) {
            t tVar = this.f48186c[i23];
            int i24 = i23 % 2;
            f fVar = (f) arrayList.get((i11 == i20 || i11 == i19) ? i23 / 2 : i23);
            boolean z13 = fVar.f48206n;
            sf.a aVar = fVar.f48195a;
            if (z13) {
                LinearLayout linearLayout = (LinearLayout) tVar.f4621e;
                s5 s5Var = (s5) tVar.f4619b;
                TextView textView2 = (TextView) tVar.d;
                TextView textView3 = (TextView) tVar.f4620c;
                if (linearLayout.getMeasuredHeight() == 0) {
                    linearLayout.requestLayout();
                }
                linearLayout.setVisibility(i21);
                int i25 = i23;
                long j12 = aVar.f47874a[i10];
                if (i11 != i20) {
                    if (i11 != 2) {
                        float f11 = j12;
                        if (j12 < 10000) {
                            i12 = 1;
                            charSequenceX0 = String.format("%d", Long.valueOf(j12));
                        } else {
                            i12 = 1;
                            int i26 = 0;
                            while (f11 >= 1000.0f && i26 < AndroidUtilities.numbersSignatureArray.length - 1) {
                                f11 /= 1000.0f;
                                i26++;
                            }
                            charSequenceX0 = String.format("%.2f", Float.valueOf(f11)) + AndroidUtilities.numbersSignatureArray[i26];
                        }
                    } else if (i24 == 0) {
                        charSequenceX0 = oa.X0(false, i0.a.m(j12, ' ', new StringBuilder("XTR ")), 0.7f, null);
                    } else {
                        charSequenceX0 = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f10), "USD");
                    }
                    s5Var.setText(charSequenceX0);
                    if (i11 == i12) {
                        if (i24 == 0) {
                            i17 = R.string.ChartInTON;
                        } else {
                            i17 = R.string.ChartInUSD;
                        }
                        Object[] objArr = new Object[i12];
                        objArr[0] = aVar.d;
                        textView3.setText(LocaleController.formatString(i17, objArr));
                    } else if (i11 == 2) {
                        if (i24 == 0) {
                            i13 = R.string.ChartInXTR;
                        } else {
                            i13 = R.string.ChartInUSD;
                        }
                        textView3.setText(oa.X0(false, LocaleController.formatString(i13, aVar.d), 0.7f, null));
                    } else {
                        textView3.setText(aVar.d);
                    }
                    i14 = aVar.f47879g;
                    c6 c6Var = this.F;
                    if (i14 >= 0 || !g6.c1(i14)) {
                        if (g6.A0().q()) {
                            i15 = aVar.f47880i;
                        } else {
                            i15 = aVar.h;
                        }
                        s5Var.setTextColor(i15);
                    } else {
                        s5Var.setTextColor(g6.v0(aVar.f47879g, c6Var));
                    }
                    int i27 = g6.f23161j5;
                    textView3.setTextColor(g6.v0(i27, c6Var));
                    if (this.A || textView2 == null) {
                        i16 = i25;
                    } else {
                        textView2.setVisibility(0);
                        textView2.setTextColor(g6.v0(i27, c6Var));
                        i16 = i25;
                        float f12 = ((f) arrayList.get(i16)).f48195a.f47874a[i10] / j11;
                        if (f12 >= 0.1f || f12 == 0.0f) {
                            Locale locale = Locale.ENGLISH;
                            textView2.setText(Math.round(f12 * 100.0f) + "%");
                        } else {
                            textView2.setText(String.format(Locale.ENGLISH, "%.1f%s", Float.valueOf(f12 * 100.0f), "%"));
                        }
                    }
                    i23 = i16 + 1;
                    i19 = 2;
                    i20 = 1;
                    i21 = 0;
                } else if (i24 == 0) {
                    if (this.H == null) {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        this.H = decimalFormat;
                        decimalFormat.setMinimumFractionDigits(2);
                        i18 = 6;
                        this.H.setMaximumFractionDigits(6);
                        this.H.setGroupingUsed(false);
                    } else {
                        i18 = 6;
                    }
                    DecimalFormat decimalFormat2 = this.H;
                    if (j12 > 1000000000) {
                        i18 = 2;
                    }
                    decimalFormat2.setMaximumFractionDigits(i18);
                    charSequenceX0 = fe.f0("TON " + this.H.format(j12 / 1.0E9d), s5Var.getPaint(), 0.82f, 0.0f, false);
                } else {
                    charSequenceX0 = "≈" + BillingController.getInstance().formatCurrency((long) (j12 / f10), "USD");
                }
                i12 = 1;
                s5Var.setText(charSequenceX0);
                if (i11 == i12) {
                    if (i24 == 0) {
                        i17 = R.string.ChartInTON;
                    } else {
                        i17 = R.string.ChartInUSD;
                    }
                    Object[] objArr2 = new Object[i12];
                    objArr2[0] = aVar.d;
                    textView3.setText(LocaleController.formatString(i17, objArr2));
                } else if (i11 == 2) {
                    if (i24 == 0) {
                        i13 = R.string.ChartInXTR;
                    } else {
                        i13 = R.string.ChartInUSD;
                    }
                    textView3.setText(oa.X0(false, LocaleController.formatString(i13, aVar.d), 0.7f, null));
                } else {
                    textView3.setText(aVar.d);
                }
                i14 = aVar.f47879g;
                c6 c6Var2 = this.F;
                if (i14 >= 0) {
                    if (g6.A0().q()) {
                        i15 = aVar.f47880i;
                    } else {
                        i15 = aVar.h;
                    }
                    s5Var.setTextColor(i15);
                } else {
                    if (g6.A0().q()) {
                        i15 = aVar.f47880i;
                    } else {
                        i15 = aVar.h;
                    }
                    s5Var.setTextColor(i15);
                }
                int i28 = g6.f23161j5;
                textView3.setTextColor(g6.v0(i28, c6Var2));
                if (this.A) {
                }
                i16 = i25;
            } else {
                ((LinearLayout) tVar.f4621e).setVisibility(8);
                i16 = i23;
            }
            i23 = i16 + 1;
            i19 = 2;
            i20 = 1;
            i21 = 0;
        }
        boolean z14 = this.B;
        ImageView imageView = this.f48188f;
        if (z14) {
            this.C = j11 > 0;
            imageView.setVisibility(j11 > 0 ? 0 : 8);
        } else {
            this.C = false;
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z10, boolean z11) {
        mu0 mu0Var = this.G;
        if (z10) {
            AndroidUtilities.runOnUIThread(mu0Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(mu0Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f48188f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new zb1(this, 9)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f48185b;
        linearLayout.removeAllViews();
        this.f48186c = new t[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f48186c[i11] = new t(this);
            linearLayout.addView((LinearLayout) this.f48186c[i11].f4621e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f48193x = z10;
    }
}
