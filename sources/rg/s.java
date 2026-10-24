package rg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class s implements Runnable {
    public final int f46052a;
    public final m0 f46053b;
    public final j f46054c;

    public s(m0 m0Var, j jVar, int i10) {
        this.f46052a = i10;
        this.f46053b = m0Var;
        this.f46054c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f46052a) {
            case 0:
                this.f46053b.q0(this.f46054c);
                return;
            default:
                final m0 m0Var = this.f46053b;
                LinearLayout linearLayout = new LinearLayout(m0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(m0Var.getContext());
                int i10 = k6.E8;
                u uVar = m0Var.Q1;
                r6.W(textView, i10, uVar);
                textView.setBackground(k6.M0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f46054c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                m0 m0Var2 = m0Var;
                                m0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.m1 m1Var = m0Var2.R1;
                                if (m1Var != null && m1Var.isShowing()) {
                                    m0Var2.R1.d(true);
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var3 = m0Var;
                                m0Var3.getClass();
                                ((p2) jVar).r(true);
                                org.telegram.ui.ActionBar.m1 m1Var2 = m0Var3.R1;
                                if (m1Var2 != null && m1Var2.isShowing()) {
                                    m0Var3.R1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, z5.n(-2, 48));
                if (jVar instanceof w2) {
                    TextView textView2 = new TextView(m0Var.getContext());
                    r6.W(textView2, i10, uVar);
                    textView2.setBackground(k6.M0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(m0Var, 2));
                    linearLayout.addView(textView2, z5.n(-2, 48));
                }
                if (jVar instanceof p2) {
                    TextView textView3 = new TextView(m0Var.getContext());
                    r6.W(textView3, i10, uVar);
                    textView3.setBackgroundDrawable(k6.M0(false));
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
                                    m0 m0Var2 = m0Var;
                                    m0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.m1 m1Var = m0Var2.R1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        m0Var2.R1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m0 m0Var3 = m0Var;
                                    m0Var3.getClass();
                                    ((p2) jVar).r(true);
                                    org.telegram.ui.ActionBar.m1 m1Var2 = m0Var3.R1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        m0Var3.R1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, z5.n(-2, 48));
                }
                if (!(jVar instanceof z1)) {
                    TextView textView4 = new TextView(m0Var.getContext());
                    r6.W(textView4, i10, uVar);
                    textView4.setBackgroundDrawable(k6.M0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(m0Var, 3));
                    linearLayout.addView(textView4, z5.n(-2, 48));
                }
                m0Var.S1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
