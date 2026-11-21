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
    public final TextView f58682a;
    public final TextView f58683b;
    public final LimitPreviewView f58684c;

    public e(Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f58682a = textView;
        i5.c.x(textView, 1, 15.0f);
        t6.U(textView, m6.G6, h6Var);
        addView(textView, ma.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f58683b = textView2;
        t6.U(textView2, m6.f29770y6, h6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ma.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, h6Var);
        this.f58684c = limitPreviewView;
        addView(limitPreviewView, ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f58682a.setText(dVar.f58676a);
        this.f58683b.setText(dVar.f58677b);
        LimitPreviewView limitPreviewView = this.f58684c;
        limitPreviewView.f33079w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f33080x.setText(String.format("%d", Integer.valueOf(dVar.f58678c)));
    }
}
