package ug;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class s implements Runnable {
    public final int f56245a;
    public final f0 f56246b;
    public final j f56247c;

    public s(f0 f0Var, j jVar, int i3) {
        this.f56245a = i3;
        this.f56246b = f0Var;
        this.f56247c = jVar;
    }

    @Override
    public final void run() {
        int i3 = this.f56245a;
        final j jVar = this.f56247c;
        final f0 f0Var = this.f56246b;
        switch (i3) {
            case 0:
                f0Var.q0(jVar);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(f0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(f0Var.getContext());
                int i10 = k6.E8;
                u uVar = f0Var.A1;
                r6.V(textView, i10, uVar);
                textView.setBackground(k6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(bd.M0(2131747680, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                f0 f0Var2 = f0Var;
                                f0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.f1 f1Var = f0Var2.B1;
                                if (f1Var != null && f1Var.isShowing()) {
                                    f0Var2.B1.d(true);
                                    return;
                                }
                                return;
                            default:
                                f0 f0Var3 = f0Var;
                                f0Var3.getClass();
                                ((d2) jVar).r(true);
                                org.telegram.ui.ActionBar.f1 f1Var2 = f0Var3.B1;
                                if (f1Var2 != null && f1Var2.isShowing()) {
                                    f0Var3.B1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, mf.o(-2, 48));
                if (jVar instanceof l2) {
                    TextView textView2 = new TextView(f0Var.getContext());
                    r6.V(textView2, i10, uVar);
                    textView2.setBackground(k6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(bd.M0(2131747678, null));
                    textView2.setOnClickListener(new k(f0Var, 2));
                    linearLayout.addView(textView2, mf.o(-2, 48));
                }
                if (jVar instanceof d2) {
                    TextView textView3 = new TextView(f0Var.getContext());
                    r6.V(textView3, i10, uVar);
                    textView3.setBackgroundDrawable(k6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(bd.M0(2131750691, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    f0 f0Var2 = f0Var;
                                    f0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.f1 f1Var = f0Var2.B1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        f0Var2.B1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.getClass();
                                    ((d2) jVar).r(true);
                                    org.telegram.ui.ActionBar.f1 f1Var2 = f0Var3.B1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        f0Var3.B1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, mf.o(-2, 48));
                }
                if (!(jVar instanceof n1)) {
                    TextView textView4 = new TextView(f0Var.getContext());
                    r6.V(textView4, i10, uVar);
                    textView4.setBackgroundDrawable(k6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(bd.M0(2131747679, null));
                    textView4.setOnClickListener(new k(f0Var, 3));
                    linearLayout.addView(textView4, mf.o(-2, 48));
                }
                f0Var.C1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
