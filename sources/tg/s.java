package tg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class s implements Runnable {
    public final int f58116a;
    public final g0 f58117b;
    public final j f58118c;

    public s(g0 g0Var, j jVar, int i7) {
        this.f58116a = i7;
        this.f58117b = g0Var;
        this.f58118c = jVar;
    }

    @Override
    public final void run() {
        int i7 = this.f58116a;
        final j jVar = this.f58118c;
        final g0 g0Var = this.f58117b;
        switch (i7) {
            case 0:
                g0Var.q0(jVar);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(g0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(g0Var.getContext());
                int i10 = n6.E8;
                u uVar = g0Var.A1;
                u6.U(textView, i10, uVar);
                textView.setBackground(n6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(gd.M0(2131747479, null));
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
                                org.telegram.ui.ActionBar.h1 h1Var = g0Var2.B1;
                                if (h1Var != null && h1Var.isShowing()) {
                                    g0Var2.B1.d(true);
                                    return;
                                }
                                return;
                            default:
                                g0 g0Var3 = g0Var;
                                g0Var3.getClass();
                                ((f2) jVar).r(true);
                                org.telegram.ui.ActionBar.h1 h1Var2 = g0Var3.B1;
                                if (h1Var2 != null && h1Var2.isShowing()) {
                                    g0Var3.B1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, ma.o(-2, 48));
                if (jVar instanceof m2) {
                    TextView textView2 = new TextView(g0Var.getContext());
                    u6.U(textView2, i10, uVar);
                    textView2.setBackground(n6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(gd.M0(2131747477, null));
                    textView2.setOnClickListener(new k(g0Var, 2));
                    linearLayout.addView(textView2, ma.o(-2, 48));
                }
                if (jVar instanceof f2) {
                    TextView textView3 = new TextView(g0Var.getContext());
                    u6.U(textView3, i10, uVar);
                    textView3.setBackgroundDrawable(n6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(gd.M0(2131750674, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.h1 h1Var = g0Var2.B1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        g0Var2.B1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.getClass();
                                    ((f2) jVar).r(true);
                                    org.telegram.ui.ActionBar.h1 h1Var2 = g0Var3.B1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        g0Var3.B1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, ma.o(-2, 48));
                }
                if (!(jVar instanceof n1)) {
                    TextView textView4 = new TextView(g0Var.getContext());
                    u6.U(textView4, i10, uVar);
                    textView4.setBackgroundDrawable(n6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.M0(2131747478, null));
                    textView4.setOnClickListener(new k(g0Var, 3));
                    linearLayout.addView(textView4, ma.o(-2, 48));
                }
                g0Var.C1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
