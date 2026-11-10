package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f56559a;
    public final TextView f56560b;
    public final LimitPreviewView f56561c;

    public e(Context context, h6 h6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f56559a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        t6.U(textView, m6.G6, h6Var);
        addView(textView, ha.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f56560b = textView2;
        t6.U(textView2, m6.f28282y6, h6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ha.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, h6Var);
        this.f56561c = limitPreviewView;
        addView(limitPreviewView, ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f56559a.setText(dVar.f56550a);
        this.f56560b.setText(dVar.f56551b);
        LimitPreviewView limitPreviewView = this.f56561c;
        limitPreviewView.f31486w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f31487x.setText(String.format("%d", Integer.valueOf(dVar.f56552c)));
    }
}
