package qg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import w7.x5;
public final class t implements Runnable {
    public final int f46599a;
    public final m0 f46600b;
    public final j f46601c;

    public t(m0 m0Var, j jVar, int i10) {
        this.f46599a = i10;
        this.f46600b = m0Var;
        this.f46601c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f46599a) {
            case 0:
                this.f46600b.r0(this.f46601c);
                return;
            default:
                final m0 m0Var = this.f46600b;
                LinearLayout linearLayout = new LinearLayout(m0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(m0Var.getContext());
                int i10 = i6.E8;
                eh.a aVar = m0Var.Q1;
                textView.setTextColor(i6.w0(i10, aVar));
                textView.setBackground(i6.L0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f46601c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                m0 m0Var2 = m0Var;
                                m0Var2.r0(jVar2);
                                org.telegram.ui.ActionBar.n1 n1Var = m0Var2.R1;
                                if (n1Var != null && n1Var.isShowing()) {
                                    m0Var2.R1.d(true);
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var3 = m0Var;
                                m0Var3.getClass();
                                ((p2) jVar).r(true);
                                org.telegram.ui.ActionBar.n1 n1Var2 = m0Var3.R1;
                                if (n1Var2 != null && n1Var2.isShowing()) {
                                    m0Var3.R1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, x5.n(-2, 48));
                if (jVar instanceof w2) {
                    TextView textView2 = new TextView(m0Var.getContext());
                    textView2.setTextColor(i6.w0(i10, aVar));
                    textView2.setBackground(i6.L0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(m0Var, 2));
                    linearLayout.addView(textView2, x5.n(-2, 48));
                }
                if (jVar instanceof p2) {
                    TextView textView3 = new TextView(m0Var.getContext());
                    textView3.setTextColor(i6.w0(i10, aVar));
                    textView3.setBackgroundDrawable(i6.L0(false));
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
                                    m0Var2.r0(jVar2);
                                    org.telegram.ui.ActionBar.n1 n1Var = m0Var2.R1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        m0Var2.R1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m0 m0Var3 = m0Var;
                                    m0Var3.getClass();
                                    ((p2) jVar).r(true);
                                    org.telegram.ui.ActionBar.n1 n1Var2 = m0Var3.R1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        m0Var3.R1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, x5.n(-2, 48));
                }
                if (!(jVar instanceof y1)) {
                    TextView textView4 = new TextView(m0Var.getContext());
                    textView4.setTextColor(i6.w0(i10, aVar));
                    textView4.setBackgroundDrawable(i6.L0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(m0Var, 3));
                    linearLayout.addView(textView4, x5.n(-2, 48));
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
