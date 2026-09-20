package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.y5;
public final class f extends LinearLayout {
    public final TextView f42581a;
    public final TextView f42582b;
    public final LimitPreviewView f42583c;

    public f(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f42581a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        addView(textView, y5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f42582b = textView2;
        rk.n(j6.f19477y6, f6Var, textView2, 1, 14.0f);
        addView(textView2, y5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, f6Var, 20);
        this.f42583c = limitPreviewView;
        addView(limitPreviewView, y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f42581a.setText(eVar.f42573a);
        this.f42582b.setText(eVar.f42574b);
        LimitPreviewView limitPreviewView = this.f42583c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f22340w.setText(String.format("%d", Integer.valueOf(eVar.f42575c)));
    }
}
