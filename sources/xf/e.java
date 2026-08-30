package xf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.r;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.tl0;
import ph.j2;
public class e extends FrameLayout {
    public boolean B;
    public boolean C;
    public boolean D;
    public Drawable E;
    public z F;
    public final f6 G;
    public final tl0 H;
    public DecimalFormat I;
    public boolean f46939a;
    public final LinearLayout f46940b;
    public r[] f46941c;
    public final TextView d;
    public final TextView e;
    public final ImageView f46942f;
    public final RadialProgressView h;
    public final SimpleDateFormat f46943n;
    public final SimpleDateFormat f46944r;
    public final SimpleDateFormat f46945s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f46946w;
    public boolean f46947x;
    public boolean f46948y;

    public e(Context context, f6 f6Var) {
        super(context);
        this.f46943n = new SimpleDateFormat("E, ");
        this.f46944r = new SimpleDateFormat("MMM dd");
        this.f46945s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f46946w = new SimpleDateFormat(" HH:mm");
        this.D = true;
        this.H = new tl0(this, 12);
        this.G = f6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f46940b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f46942f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, b6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, b6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, b6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, b6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, b6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i10 = j6.f20012j5;
        f6 f6Var = this.G;
        this.d.setTextColor(j6.v0(i10, f6Var));
        this.e.setTextColor(j6.v0(i10, f6Var));
        int i11 = j6.gj;
        this.f46942f.setColorFilter(j6.v0(i11, f6Var));
        this.h.setProgressColor(j6.v0(i11, f6Var));
        this.E = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.F = j6.i0(dp, dp, dp, dp, j6.v0(j6.f19977h5, f6Var), j6.v0(j6.f19996i6, f6Var), -16777216);
        nq nqVar = new nq(this.E, this.F, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        nqVar.f27342w = true;
        setBackground(nqVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: xf.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
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
        this.f46942f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new j2(this, 12)).start();
        }
    }

    public void setSize(int i10) {
        LinearLayout linearLayout = this.f46940b;
        linearLayout.removeAllViews();
        this.f46941c = new r[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f46941c[i11] = new r(this);
            linearLayout.addView((LinearLayout) this.f46941c[i11].e);
        }
    }

    public void setUseWeek(boolean z4) {
        this.f46947x = z4;
    }
}
