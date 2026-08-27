package zf;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;

public final class s implements Runnable {

    public final int f50692a;

    public final l0 f50693b;

    public final j f50694c;

    public s(l0 l0Var, j jVar, int i10) {
        this.f50692a = i10;
        this.f50693b = l0Var;
        this.f50694c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f50692a) {
            case 0:
                this.f50693b.q0(this.f50694c);
                break;
            default:
                final l0 l0Var = this.f50693b;
                LinearLayout linearLayout = new LinearLayout(l0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(l0Var.getContext());
                int i10 = g6.E8;
                ng.b bVar = l0Var.M1;
                textView.setTextColor(g6.v0(i10, bVar));
                textView.setBackground(g6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final int i11 = 0;
                final j jVar = this.f50694c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                j jVar2 = jVar;
                                l0 l0Var2 = l0Var;
                                l0Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.n1 n1Var = l0Var2.N1;
                                if (n1Var != null && n1Var.isShowing()) {
                                    l0Var2.N1.d(true);
                                    break;
                                }
                                break;
                            default:
                                l0 l0Var3 = l0Var;
                                l0Var3.getClass();
                                ((o2) jVar).r(true);
                                org.telegram.ui.ActionBar.n1 n1Var2 = l0Var3.N1;
                                if (n1Var2 != null && n1Var2.isShowing()) {
                                    l0Var3.N1.d(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(textView, z5.n(-2, 48));
                if (jVar instanceof v2) {
                    TextView textView2 = new TextView(l0Var.getContext());
                    textView2.setTextColor(g6.v0(i10, bVar));
                    textView2.setBackground(g6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(l0Var, 2));
                    linearLayout.addView(textView2, z5.n(-2, 48));
                }
                if (jVar instanceof o2) {
                    TextView textView3 = new TextView(l0Var.getContext());
                    textView3.setTextColor(g6.v0(i10, bVar));
                    textView3.setBackgroundDrawable(g6.K0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    final int i12 = 1;
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    j jVar2 = jVar;
                                    l0 l0Var2 = l0Var;
                                    l0Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.n1 n1Var = l0Var2.N1;
                                    if (n1Var != null && n1Var.isShowing()) {
                                        l0Var2.N1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l0 l0Var3 = l0Var;
                                    l0Var3.getClass();
                                    ((o2) jVar).r(true);
                                    org.telegram.ui.ActionBar.n1 n1Var2 = l0Var3.N1;
                                    if (n1Var2 != null && n1Var2.isShowing()) {
                                        l0Var3.N1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, z5.n(-2, 48));
                }
                if (!(jVar instanceof x1)) {
                    TextView textView4 = new TextView(l0Var.getContext());
                    textView4.setTextColor(g6.v0(i10, bVar));
                    textView4.setBackgroundDrawable(g6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(l0Var, 3));
                    linearLayout.addView(textView4, z5.n(-2, 48));
                }
                l0Var.O1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
