package tg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class s implements Runnable {
    public final int f58122a;
    public final h0 f58123b;
    public final j f58124c;

    public s(h0 h0Var, j jVar, int i7) {
        this.f58122a = i7;
        this.f58123b = h0Var;
        this.f58124c = jVar;
    }

    @Override
    public final void run() {
        int i7 = this.f58122a;
        final j jVar = this.f58124c;
        final h0 h0Var = this.f58123b;
        switch (i7) {
            case 0:
                h0Var.q0(jVar);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(h0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(h0Var.getContext());
                int i10 = m6.E8;
                v vVar = h0Var.A1;
                t6.U(textView, i10, vVar);
                textView.setBackground(m6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(hd.N0(2131747478, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                h0 h0Var2 = h0Var;
                                h0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.g1 g1Var = h0Var2.B1;
                                if (g1Var != null && g1Var.isShowing()) {
                                    h0Var2.B1.d(true);
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var3 = h0Var;
                                h0Var3.getClass();
                                ((g2) jVar).r(true);
                                org.telegram.ui.ActionBar.g1 g1Var2 = h0Var3.B1;
                                if (g1Var2 != null && g1Var2.isShowing()) {
                                    h0Var3.B1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, na.o(-2, 48));
                if (jVar instanceof n2) {
                    TextView textView2 = new TextView(h0Var.getContext());
                    t6.U(textView2, i10, vVar);
                    textView2.setBackground(m6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(hd.N0(2131747476, null));
                    textView2.setOnClickListener(new k(h0Var, 2));
                    linearLayout.addView(textView2, na.o(-2, 48));
                }
                if (jVar instanceof g2) {
                    TextView textView3 = new TextView(h0Var.getContext());
                    t6.U(textView3, i10, vVar);
                    textView3.setBackgroundDrawable(m6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(hd.N0(2131750673, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    h0 h0Var2 = h0Var;
                                    h0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.g1 g1Var = h0Var2.B1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        h0Var2.B1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    h0 h0Var3 = h0Var;
                                    h0Var3.getClass();
                                    ((g2) jVar).r(true);
                                    org.telegram.ui.ActionBar.g1 g1Var2 = h0Var3.B1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        h0Var3.B1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, na.o(-2, 48));
                }
                if (!(jVar instanceof p1)) {
                    TextView textView4 = new TextView(h0Var.getContext());
                    t6.U(textView4, i10, vVar);
                    textView4.setBackgroundDrawable(m6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(hd.N0(2131747477, null));
                    textView4.setOnClickListener(new k(h0Var, 3));
                    linearLayout.addView(textView4, na.o(-2, 48));
                }
                h0Var.C1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
