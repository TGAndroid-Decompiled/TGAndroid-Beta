package tg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class s implements Runnable {
    public final int f55937a;
    public final g0 f55938b;
    public final j f55939c;

    public s(g0 g0Var, j jVar, int i7) {
        this.f55937a = i7;
        this.f55938b = g0Var;
        this.f55939c = jVar;
    }

    @Override
    public final void run() {
        int i7 = this.f55937a;
        final j jVar = this.f55939c;
        final g0 g0Var = this.f55938b;
        switch (i7) {
            case 0:
                g0Var.q0(jVar);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(g0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(g0Var.getContext());
                int i10 = k6.E8;
                u uVar = g0Var.f55704z1;
                r6.V(textView, i10, uVar);
                textView.setBackground(k6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(id.M0(2131747673, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                g0 g0Var2 = g0Var;
                                g0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.g1 g1Var = g0Var2.A1;
                                if (g1Var != null && g1Var.isShowing()) {
                                    g0Var2.A1.d(true);
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var3 = g0Var;
                                g0Var3.getClass();
                                ((d2) jVar).r(true);
                                org.telegram.ui.ActionBar.g1 g1Var2 = g0Var3.A1;
                                if (g1Var2 != null && g1Var2.isShowing()) {
                                    g0Var3.A1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, ha.o(-2, 48));
                if (jVar instanceof k2) {
                    TextView textView2 = new TextView(g0Var.getContext());
                    r6.V(textView2, i10, uVar);
                    textView2.setBackground(k6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(id.M0(2131747671, null));
                    textView2.setOnClickListener(new k(g0Var, 2));
                    linearLayout.addView(textView2, ha.o(-2, 48));
                }
                if (jVar instanceof d2) {
                    TextView textView3 = new TextView(g0Var.getContext());
                    r6.V(textView3, i10, uVar);
                    textView3.setBackgroundDrawable(k6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(id.M0(2131750691, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.g1 g1Var = g0Var2.A1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        g0Var2.A1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.getClass();
                                    ((d2) jVar).r(true);
                                    org.telegram.ui.ActionBar.g1 g1Var2 = g0Var3.A1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        g0Var3.A1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, ha.o(-2, 48));
                }
                if (!(jVar instanceof n1)) {
                    TextView textView4 = new TextView(g0Var.getContext());
                    r6.V(textView4, i10, uVar);
                    textView4.setBackgroundDrawable(k6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(id.M0(2131747672, null));
                    textView4.setOnClickListener(new k(g0Var, 3));
                    linearLayout.addView(textView4, ha.o(-2, 48));
                }
                g0Var.B1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
