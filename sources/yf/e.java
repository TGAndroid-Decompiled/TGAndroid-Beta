package yf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.tl0;
import qh.i2;
public class e extends FrameLayout {
    public boolean B;
    public boolean C;
    public boolean D;
    public Drawable E;
    public z F;
    public final g6 G;
    public final tl0 H;
    public DecimalFormat I;
    public boolean f50947a;
    public final LinearLayout f50948b;
    public sf.f[] f50949c;
    public final TextView d;
    public final TextView f50950e;
    public final ImageView f50951f;
    public final RadialProgressView h;
    public final SimpleDateFormat f50952n;
    public final SimpleDateFormat f50953r;
    public final SimpleDateFormat f50954s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f50955w;
    public boolean f50956x;
    public boolean f50957y;

    public e(Context context, g6 g6Var) {
        super(context);
        this.f50952n = new SimpleDateFormat("E, ");
        this.f50953r = new SimpleDateFormat("MMM dd");
        this.f50954s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f50955w = new SimpleDateFormat(" HH:mm");
        this.D = true;
        this.H = new tl0(this, 12);
        this.G = g6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f50948b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f50950e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f50951f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, c6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, c6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, c6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, c6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, c6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = k6.f21768j5;
        g6 g6Var = this.G;
        this.d.setTextColor(k6.v0(i10, g6Var));
        this.f50950e.setTextColor(k6.v0(i10, g6Var));
        int i11 = k6.gj;
        this.f50951f.setColorFilter(k6.v0(i11, g6Var));
        this.h.setProgressColor(k6.v0(i11, g6Var));
        this.E = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.F = k6.i0(dp, dp, dp, dp, k6.v0(k6.f21733h5, g6Var), k6.v0(k6.f21752i6, g6Var), -16777216);
        pq pqVar = new pq(this.E, this.F, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        pqVar.f30166w = true;
        setBackground(pqVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z4, boolean z10) {
        tl0 tl0Var = this.H;
        if (z4) {
            AndroidUtilities.runOnUIThread(tl0Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(tl0Var);
        RadialProgressView radialProgressView = this.h;
        if (z10) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f50951f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new i2(this, 12)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f50948b;
        linearLayout.removeAllViews();
        this.f50949c = new sf.f[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f50949c[i11] = new sf.f(this);
            linearLayout.addView((LinearLayout) this.f50949c[i11].f47353e);
        }
    }

    public void setUseWeek(boolean z4) {
        this.f50956x = z4;
    }
}
