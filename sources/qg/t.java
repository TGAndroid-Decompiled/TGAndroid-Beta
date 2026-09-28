package qg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import w7.y5;
public final class t implements Runnable {
    public final int f41926a;
    public final n0 f41927b;
    public final j f41928c;

    public t(n0 n0Var, j jVar, int i10) {
        this.f41926a = i10;
        this.f41927b = n0Var;
        this.f41928c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f41926a) {
            case 0:
                this.f41927b.r0(this.f41928c);
                return;
            default:
                final n0 n0Var = this.f41927b;
                LinearLayout linearLayout = new LinearLayout(n0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(n0Var.getContext());
                int i10 = h6.E8;
                eh.a aVar = n0Var.Q1;
                textView.setTextColor(h6.v0(i10, aVar));
                textView.setBackground(h6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f41928c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                n0 n0Var2 = n0Var;
                                n0Var2.r0(jVar2);
                                org.telegram.ui.ActionBar.m1 m1Var = n0Var2.R1;
                                if (m1Var != null && m1Var.isShowing()) {
                                    n0Var2.R1.d(true);
                                    return;
                                }
                                return;
                            default:
                                n0 n0Var3 = n0Var;
                                n0Var3.getClass();
                                ((o2) jVar).r(true);
                                org.telegram.ui.ActionBar.m1 m1Var2 = n0Var3.R1;
                                if (m1Var2 != null && m1Var2.isShowing()) {
                                    n0Var3.R1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, y5.n(-2, 48));
                if (jVar instanceof v2) {
                    TextView textView2 = new TextView(n0Var.getContext());
                    textView2.setTextColor(h6.v0(i10, aVar));
                    textView2.setBackground(h6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(n0Var, 2));
                    linearLayout.addView(textView2, y5.n(-2, 48));
                }
                if (jVar instanceof o2) {
                    TextView textView3 = new TextView(n0Var.getContext());
                    textView3.setTextColor(h6.v0(i10, aVar));
                    textView3.setBackgroundDrawable(h6.K0(false));
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
                                    n0Var2.r0(jVar2);
                                    org.telegram.ui.ActionBar.m1 m1Var = n0Var2.R1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        n0Var2.R1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    n0 n0Var3 = n0Var;
                                    n0Var3.getClass();
                                    ((o2) jVar).r(true);
                                    org.telegram.ui.ActionBar.m1 m1Var2 = n0Var3.R1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        n0Var3.R1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, y5.n(-2, 48));
                }
                if (!(jVar instanceof y1)) {
                    TextView textView4 = new TextView(n0Var.getContext());
                    textView4.setTextColor(h6.v0(i10, aVar));
                    textView4.setBackgroundDrawable(h6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(n0Var, 3));
                    linearLayout.addView(textView4, y5.n(-2, 48));
                }
                n0Var.S1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
