package vg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f56593a;
    public final TextView f56594b;
    public final LimitPreviewView f56595c;

    public e(Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f56593a = textView;
        k2.p1.t(textView, 1, 15.0f);
        r6.V(textView, k6.G6, e6Var);
        addView(textView, mf.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f56594b = textView2;
        r6.V(textView2, k6.f28273y6, e6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, mf.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, e6Var);
        this.f56595c = limitPreviewView;
        addView(limitPreviewView, mf.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f56593a.setText(dVar.f56584a);
        this.f56594b.setText(dVar.f56585b);
        LimitPreviewView limitPreviewView = this.f56595c;
        limitPreviewView.f31542w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f31543x.setText(String.format("%d", Integer.valueOf(dVar.f56586c)));
    }
}
