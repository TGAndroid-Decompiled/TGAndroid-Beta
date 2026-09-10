package qg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.a6;
public final class f extends LinearLayout {
    public final TextView f40728a;
    public final TextView f40729b;
    public final LimitPreviewView f40730c;

    public f(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f40728a = textView;
        e2.k(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        addView(textView, a6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f40729b = textView2;
        em.n(j6.f18306y6, f6Var, textView2, 1, 14.0f);
        addView(textView2, a6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, f6Var, 20);
        this.f40730c = limitPreviewView;
        addView(limitPreviewView, a6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f40728a.setText(eVar.f40714a);
        this.f40729b.setText(eVar.f40715b);
        LimitPreviewView limitPreviewView = this.f40730c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f21204w.setText(String.format("%d", Integer.valueOf(eVar.f40716c)));
    }
}
