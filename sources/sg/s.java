package sg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class s implements Runnable {
    public final int f48494a;
    public final n0 f48495b;
    public final j f48496c;

    public s(n0 n0Var, j jVar, int i10) {
        this.f48494a = i10;
        this.f48495b = n0Var;
        this.f48496c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f48494a) {
            case 0:
                this.f48495b.p0(this.f48496c);
                return;
            default:
                final n0 n0Var = this.f48495b;
                LinearLayout linearLayout = new LinearLayout(n0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(n0Var.getContext());
                int i10 = y6.E8;
                v vVar = n0Var.F1;
                f7.V(textView, i10, vVar);
                textView.setBackground(y6.M0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f48496c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                n0 n0Var2 = n0Var;
                                n0Var2.p0(jVar2);
                                org.telegram.ui.ActionBar.o1 o1Var = n0Var2.G1;
                                if (o1Var != null && o1Var.isShowing()) {
                                    n0Var2.G1.d(true);
                                    return;
                                }
                                return;
                            default:
                                n0 n0Var3 = n0Var;
                                n0Var3.getClass();
                                ((q2) jVar).r(true);
                                org.telegram.ui.ActionBar.o1 o1Var2 = n0Var3.G1;
                                if (o1Var2 != null && o1Var2.isShowing()) {
                                    n0Var3.G1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, gb1.r(-2, 48));
                if (jVar instanceof x2) {
                    TextView textView2 = new TextView(n0Var.getContext());
                    f7.V(textView2, i10, vVar);
                    textView2.setBackground(y6.M0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(n0Var, 2));
                    linearLayout.addView(textView2, gb1.r(-2, 48));
                }
                if (jVar instanceof q2) {
                    TextView textView3 = new TextView(n0Var.getContext());
                    f7.V(textView3, i10, vVar);
                    textView3.setBackgroundDrawable(y6.M0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    n0 n0Var2 = n0Var;
                                    n0Var2.p0(jVar2);
                                    org.telegram.ui.ActionBar.o1 o1Var = n0Var2.G1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        n0Var2.G1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    n0 n0Var3 = n0Var;
                                    n0Var3.getClass();
                                    ((q2) jVar).r(true);
                                    org.telegram.ui.ActionBar.o1 o1Var2 = n0Var3.G1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        n0Var3.G1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, gb1.r(-2, 48));
                }
                if (!(jVar instanceof z1)) {
                    TextView textView4 = new TextView(n0Var.getContext());
                    f7.V(textView4, i10, vVar);
                    textView4.setBackgroundDrawable(y6.M0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(n0Var, 3));
                    linearLayout.addView(textView4, gb1.r(-2, 48));
                }
                n0Var.H1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
