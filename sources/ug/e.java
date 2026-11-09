package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f56560a;
    public final TextView f56561b;
    public final LimitPreviewView f56562c;

    public e(Context context, g6 g6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f56560a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        s6.U(textView, l6.G6, g6Var);
        addView(textView, ha.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f56561b = textView2;
        s6.U(textView2, l6.f28257y6, g6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ha.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, g6Var);
        this.f56562c = limitPreviewView;
        addView(limitPreviewView, ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f56560a.setText(dVar.f56551a);
        this.f56561b.setText(dVar.f56552b);
        LimitPreviewView limitPreviewView = this.f56562c;
        limitPreviewView.f31475w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f31476x.setText(String.format("%d", Integer.valueOf(dVar.f56553c)));
    }
}
