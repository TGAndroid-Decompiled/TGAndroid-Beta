package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f58644a;
    public final TextView f58645b;
    public final LimitPreviewView f58646c;

    public e(Context context, i6 i6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f58644a = textView;
        i5.c.x(textView, 1, 15.0f);
        u6.U(textView, n6.G6, i6Var);
        addView(textView, ma.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f58645b = textView2;
        u6.U(textView2, n6.f29786y6, i6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ma.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, i6Var);
        this.f58646c = limitPreviewView;
        addView(limitPreviewView, ma.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f58644a.setText(dVar.f58637a);
        this.f58645b.setText(dVar.f58638b);
        LimitPreviewView limitPreviewView = this.f58646c;
        limitPreviewView.f33046w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f33047x.setText(String.format("%d", Integer.valueOf(dVar.f58639c)));
    }
}
