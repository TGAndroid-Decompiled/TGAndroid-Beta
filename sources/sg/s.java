package sg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
public final class s implements Runnable {
    public final int f48528a;
    public final m0 f48529b;
    public final j f48530c;

    public s(m0 m0Var, j jVar, int i10) {
        this.f48528a = i10;
        this.f48529b = m0Var;
        this.f48530c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f48528a) {
            case 0:
                this.f48529b.p0(this.f48530c);
                return;
            default:
                final m0 m0Var = this.f48529b;
                LinearLayout linearLayout = new LinearLayout(m0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(m0Var.getContext());
                int i10 = y6.E8;
                u uVar = m0Var.F1;
                f7.V(textView, i10, uVar);
                textView.setBackground(y6.M0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f48530c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                m0 m0Var2 = m0Var;
                                m0Var2.p0(jVar2);
                                org.telegram.ui.ActionBar.o1 o1Var = m0Var2.G1;
                                if (o1Var != null && o1Var.isShowing()) {
                                    m0Var2.G1.d(true);
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var3 = m0Var;
                                m0Var3.getClass();
                                ((p2) jVar).r(true);
                                org.telegram.ui.ActionBar.o1 o1Var2 = m0Var3.G1;
                                if (o1Var2 != null && o1Var2.isShowing()) {
                                    m0Var3.G1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, kb1.r(-2, 48));
                if (jVar instanceof w2) {
                    TextView textView2 = new TextView(m0Var.getContext());
                    f7.V(textView2, i10, uVar);
                    textView2.setBackground(y6.M0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(m0Var, 2));
                    linearLayout.addView(textView2, kb1.r(-2, 48));
                }
                if (jVar instanceof p2) {
                    TextView textView3 = new TextView(m0Var.getContext());
                    f7.V(textView3, i10, uVar);
                    textView3.setBackgroundDrawable(y6.M0(false));
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
                                    m0Var2.p0(jVar2);
                                    org.telegram.ui.ActionBar.o1 o1Var = m0Var2.G1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        m0Var2.G1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    m0 m0Var3 = m0Var;
                                    m0Var3.getClass();
                                    ((p2) jVar).r(true);
                                    org.telegram.ui.ActionBar.o1 o1Var2 = m0Var3.G1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        m0Var3.G1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, kb1.r(-2, 48));
                }
                if (!(jVar instanceof y1)) {
                    TextView textView4 = new TextView(m0Var.getContext());
                    f7.V(textView4, i10, uVar);
                    textView4.setBackgroundDrawable(y6.M0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(m0Var, 3));
                    linearLayout.addView(textView4, kb1.r(-2, 48));
                }
                m0Var.H1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}
