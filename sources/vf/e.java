package vf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.s;
import i7.f6;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.cc1;
public class e extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public Drawable D;
    public z E;
    public final c6 F;
    public final rk0 G;
    public DecimalFormat H;
    public boolean f49561a;
    public final LinearLayout f49562b;
    public s[] f49563c;
    public final TextView d;
    public final TextView f49564e;
    public final ImageView f49565f;
    public final RadialProgressView h;
    public final SimpleDateFormat f49566n;
    public final SimpleDateFormat f49567r;
    public final SimpleDateFormat f49568s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f49569w;
    public boolean f49570x;
    public boolean f49571y;

    public e(Context context, c6 c6Var) {
        super(context);
        this.f49566n = new SimpleDateFormat("E, ");
        this.f49567r = new SimpleDateFormat("MMM dd");
        this.f49568s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f49569w = new SimpleDateFormat(" HH:mm");
        this.C = true;
        this.G = new rk0(this, 12);
        this.F = c6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f49562b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f49564e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f49565f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, f6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, f6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, f6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, f6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, f6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = g6.f23169j5;
        c6 c6Var = this.F;
        this.d.setTextColor(g6.v0(i10, c6Var));
        this.f49564e.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.gj;
        this.f49565f.setColorFilter(g6.v0(i11, c6Var));
        this.h.setProgressColor(g6.v0(i11, c6Var));
        this.D = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.E = g6.i0(dp, dp, dp, dp, g6.v0(g6.f23133h5, c6Var), g6.v0(g6.f23152i6, c6Var), -16777216);
        jq jqVar = new jq(this.D, this.E, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        jqVar.f29792w = true;
        setBackground(jqVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: vf.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z10, boolean z11) {
        rk0 rk0Var = this.G;
        if (z10) {
            AndroidUtilities.runOnUIThread(rk0Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(rk0Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f49565f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new cc1(this, 12)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f49562b;
        linearLayout.removeAllViews();
        this.f49563c = new s[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f49563c[i11] = new s(this);
            linearLayout.addView((LinearLayout) this.f49563c[i11].f5187e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f49570x = z10;
    }
}
