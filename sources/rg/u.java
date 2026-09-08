package rg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import w7.x5;
public final class u implements Runnable {
    public final int f45527a;
    public final o0 f45528b;
    public final k f45529c;

    public u(o0 o0Var, k kVar, int i10) {
        this.f45527a = i10;
        this.f45528b = o0Var;
        this.f45529c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f45527a) {
            case 0:
                this.f45528b.q0(this.f45529c);
                return;
            default:
                final o0 o0Var = this.f45528b;
                LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(o0Var.getContext());
                int i10 = j6.E8;
                fh.a aVar = o0Var.Q1;
                textView.setTextColor(j6.v0(i10, aVar));
                textView.setBackground(j6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final k kVar = this.f45529c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                k kVar2 = kVar;
                                o0 o0Var2 = o0Var;
                                o0Var2.q0(kVar2);
                                org.telegram.ui.ActionBar.n1 n1Var = o0Var2.R1;
                                if (n1Var != null && n1Var.isShowing()) {
                                    o0Var2.R1.d(true);
                                    return;
                                }
                                return;
                            default:
                                o0 o0Var3 = o0Var;
                                o0Var3.getClass();
                                ((q2) kVar).r(true);
                                org.telegram.ui.ActionBar.n1 n1Var2 = o0Var3.R1;
                                if (n1Var2 != null && n1Var2.isShowing()) {
                                    o0Var3.R1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, x5.n(-2, 48));
                if (kVar instanceof x2) {
                    TextView textView2 = new TextView(o0Var.getContext());
                    textView2.setTextColor(j6.v0(i10, aVar));
                    textView2.setBackground(j6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new l(o0Var, 2));
                    linearLayout.addView(textView2, x5.n(-2, 48));
                }
                if (kVar instanceof q2) {
                    TextView textView3 = new TextView(o0Var.getContext());
                    textView3.setTextColor(j6.v0(i10, aVar));
                    textView3.setBackgroundDrawable(j6.K0(false));
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
                                    k kVar2 = kVar;
                                    o0 o0Var2 = o0Var;
                                    o0Var2.q0(kVar2);
                                    org.telegram.ui.ActionBar.n1 n1Var = o0Var2.R1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        o0Var2.R1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    o0 o0Var3 = o0Var;
                                    o0Var3.getClass();
                                    ((q2) kVar).r(true);
                                    org.telegram.ui.ActionBar.n1 n1Var2 = o0Var3.R1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        o0Var3.R1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, x5.n(-2, 48));
                }
                if (!(kVar instanceof z1)) {
                    TextView textView4 = new TextView(o0Var.getContext());
                    textView4.setTextColor(j6.v0(i10, aVar));
                    textView4.setBackgroundDrawable(j6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new l(o0Var, 3));
                    linearLayout.addView(textView4, x5.n(-2, 48));
                }
                o0Var.S1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
