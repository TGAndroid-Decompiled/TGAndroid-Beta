package yf;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
public final class s implements Runnable {
    public final int f50097a;
    public final l0 f50098b;
    public final j f50099c;

    public s(l0 l0Var, j jVar, int i9) {
        this.f50097a = i9;
        this.f50098b = l0Var;
        this.f50099c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f50097a) {
            case 0:
                this.f50098b.q0(this.f50099c);
                return;
            default:
                final l0 l0Var = this.f50098b;
                LinearLayout linearLayout = new LinearLayout(l0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(l0Var.getContext());
                int i9 = f6.E8;
                mg.a aVar = l0Var.M1;
                textView.setTextColor(f6.v0(i9, aVar));
                textView.setBackground(f6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f50099c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                l0 l0Var2 = l0Var;
                                l0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.o1 o1Var = l0Var2.N1;
                                if (o1Var != null && o1Var.isShowing()) {
                                    l0Var2.N1.d(true);
                                    return;
                                }
                                return;
                            default:
                                l0 l0Var3 = l0Var;
                                l0Var3.getClass();
                                ((n2) jVar).r(true);
                                org.telegram.ui.ActionBar.o1 o1Var2 = l0Var3.N1;
                                if (o1Var2 != null && o1Var2.isShowing()) {
                                    l0Var3.N1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, e6.n(-2, 48));
                if (jVar instanceof v2) {
                    TextView textView2 = new TextView(l0Var.getContext());
                    textView2.setTextColor(f6.v0(i9, aVar));
                    textView2.setBackground(f6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(l0Var, 2));
                    linearLayout.addView(textView2, e6.n(-2, 48));
                }
                if (jVar instanceof n2) {
                    TextView textView3 = new TextView(l0Var.getContext());
                    textView3.setTextColor(f6.v0(i9, aVar));
                    textView3.setBackgroundDrawable(f6.K0(false));
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
                                    l0 l0Var2 = l0Var;
                                    l0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.o1 o1Var = l0Var2.N1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        l0Var2.N1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    l0 l0Var3 = l0Var;
                                    l0Var3.getClass();
                                    ((n2) jVar).r(true);
                                    org.telegram.ui.ActionBar.o1 o1Var2 = l0Var3.N1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        l0Var3.N1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, e6.n(-2, 48));
                }
                if (!(jVar instanceof x1)) {
                    TextView textView4 = new TextView(l0Var.getContext());
                    textView4.setTextColor(f6.v0(i9, aVar));
                    textView4.setBackgroundDrawable(f6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(l0Var, 3));
                    linearLayout.addView(textView4, e6.n(-2, 48));
                }
                l0Var.O1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
