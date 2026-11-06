package ug;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e extends LinearLayout {
    public final TextView f56456a;
    public final TextView f56457b;
    public final LimitPreviewView f56458c;

    public e(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.f56456a = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 15.0f);
        r6.V(textView, k6.G6, f6Var);
        addView(textView, ha.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f56457b = textView2;
        r6.V(textView2, k6.f28240y6, f6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, ha.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(0, 10, 20, context, f6Var);
        this.f56458c = limitPreviewView;
        addView(limitPreviewView, ha.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(d dVar) {
        this.f56456a.setText(dVar.f56447a);
        this.f56457b.setText(dVar.f56448b);
        LimitPreviewView limitPreviewView = this.f56458c;
        limitPreviewView.f31465w.setText(String.format("%d", Integer.valueOf(dVar.d)));
        limitPreviewView.f31466x.setText(String.format("%d", Integer.valueOf(dVar.f56449c)));
    }
}
