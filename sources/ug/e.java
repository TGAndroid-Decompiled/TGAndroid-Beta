package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f58686a;
    public final TextView f58687b;
    public final LimitPreviewView f58688c;

    public e(Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f58686a = textView;
        i5.c.x(textView, 1, 15.0f);
        t6.U(textView, m6.G6, h6Var);
        addView(textView, ma.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f58687b = textView2;
        t6.U(textView2, m6.f29773y6, h6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ma.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, h6Var);
        this.f58688c = limitPreviewView;
        addView(limitPreviewView, ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f58686a.setText(dVar.f58680a);
        this.f58687b.setText(dVar.f58681b);
        LimitPreviewView limitPreviewView = this.f58688c;
        limitPreviewView.f33082w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f33083x.setText(String.format("%d", Integer.valueOf(dVar.f58682c)));
    }
}
