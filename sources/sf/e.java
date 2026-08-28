package sf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.messaging.t;
import g7.e6;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.te1;
public class e extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public Drawable D;
    public z E;
    public final b6 F;
    public final ju0 G;
    public DecimalFormat H;
    public boolean f47535a;
    public final LinearLayout f47536b;
    public t[] f47537c;
    public final TextView d;
    public final TextView f47538e;
    public final ImageView f47539f;
    public final RadialProgressView h;
    public final SimpleDateFormat f47540n;
    public final SimpleDateFormat f47541r;
    public final SimpleDateFormat f47542s;
    public final SimpleDateFormat v;
    public final SimpleDateFormat f47543w;
    public boolean f47544x;
    public boolean f47545y;

    public e(Context context, b6 b6Var) {
        super(context);
        this.f47540n = new SimpleDateFormat("E, ");
        this.f47541r = new SimpleDateFormat("MMM dd");
        this.f47542s = new SimpleDateFormat("d MMM yyyy");
        this.v = new SimpleDateFormat("d MMM");
        this.f47543w = new SimpleDateFormat(" HH:mm");
        this.C = true;
        this.G = new ju0(this, 6);
        this.F = b6Var;
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f47536b = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = new TextView(context);
        this.f47538e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f47539f = imageView;
        imageView.setImageResource(R.drawable.ic_chevron_right_black_18dp);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.h = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(12.0f));
        radialProgressView.setStrokeWidth(AndroidUtilities.dp(0.5f));
        radialProgressView.setVisibility(8);
        addView(linearLayout, e6.d(-2, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
        addView(textView, e6.d(-2, -2.0f, 8388611, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(textView2, e6.d(-2, -2.0f, 8388613, 4.0f, 0.0f, 4.0f, 0.0f));
        addView(imageView, e6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        addView(radialProgressView, e6.d(18, 18.0f, 8388661, 0.0f, 2.0f, 0.0f, 0.0f));
        b();
    }

    public static String a(String str) {
        if (str.length() > 0) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public void b() {
        int i9 = f6.f23108j5;
        b6 b6Var = this.F;
        this.d.setTextColor(f6.v0(i9, b6Var));
        this.f47538e.setTextColor(f6.v0(i9, b6Var));
        int i10 = f6.gj;
        this.f47539f.setColorFilter(f6.v0(i10, b6Var));
        this.h.setProgressColor(f6.v0(i10, b6Var));
        this.D = getContext().getResources().getDrawable(R.drawable.stats_tooltip).mutate();
        int dp = AndroidUtilities.dp(4.0f);
        this.E = f6.i0(dp, dp, dp, dp, f6.v0(f6.f23072h5, b6Var), f6.v0(f6.f23092i6, b6Var), -16777216);
        fq fqVar = new fq(this.D, this.E, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        fqVar.f28550w = true;
        setBackground(fqVar);
    }

    public final void c(int r22, long r23, java.util.ArrayList r25, boolean r26, int r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: sf.e.c(int, long, java.util.ArrayList, boolean, int, float):void");
    }

    public final void d(boolean z10, boolean z11) {
        ju0 ju0Var = this.G;
        if (z10) {
            AndroidUtilities.runOnUIThread(ju0Var, 300L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(ju0Var);
        RadialProgressView radialProgressView = this.h;
        if (z11) {
            radialProgressView.setVisibility(8);
            return;
        }
        this.f47539f.animate().setDuration(80L).alpha(1.0f).start();
        if (radialProgressView.getVisibility() == 0) {
            radialProgressView.animate().setDuration(80L).alpha(0.0f).setListener(new te1(this, 7)).start();
        }
    }

    public void setSize(int i9) {
        LinearLayout linearLayout = this.f47536b;
        linearLayout.removeAllViews();
        this.f47537c = new t[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.f47537c[i10] = new t(this);
            linearLayout.addView((LinearLayout) this.f47537c[i10].f4179e);
        }
    }

    public void setUseWeek(boolean z10) {
        this.f47544x = z10;
    }
}
