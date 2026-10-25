package tg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gb1;
public final class f extends LinearLayout {
    public final TextView f48852a;
    public final TextView f48853b;
    public final LimitPreviewView f48854c;

    public f(Context context, u6 u6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f48852a = textView;
        ic.a.o(15.0f, 1, textView);
        f7.V(textView, y6.G6, u6Var);
        addView(textView, gb1.t(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f48853b = textView2;
        f7.V(textView2, y6.f23746y6, u6Var);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, gb1.t(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, u6Var, 20);
        this.f48854c = limitPreviewView;
        addView(limitPreviewView, gb1.t(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f48852a.setText(eVar.f48843a);
        this.f48853b.setText(eVar.f48844b);
        LimitPreviewView limitPreviewView = this.f48854c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f26235w.setText(String.format("%d", Integer.valueOf(eVar.f48845c)));
    }
}
