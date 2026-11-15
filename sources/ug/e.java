package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f58063a;
    public final TextView f58064b;
    public final LimitPreviewView f58065c;

    public e(Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f58063a = textView;
        i5.c.v(textView, 1, 15.0f);
        q6.U(textView, j6.G6, e6Var);
        addView(textView, ja.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f58064b = textView2;
        q6.U(textView2, j6.f29241y6, e6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ja.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, e6Var);
        this.f58065c = limitPreviewView;
        addView(limitPreviewView, ja.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f58063a.setText(dVar.f58056a);
        this.f58064b.setText(dVar.f58057b);
        LimitPreviewView limitPreviewView = this.f58065c;
        limitPreviewView.f32649w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f32650x.setText(String.format("%d", Integer.valueOf(dVar.f58058c)));
    }
}
