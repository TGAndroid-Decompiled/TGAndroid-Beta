package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.y5;
public final class f extends LinearLayout {
    public final TextView f42566a;
    public final TextView f42567b;
    public final LimitPreviewView f42568c;

    public f(Context context, d6 d6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f42566a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(h6.v0(h6.G6, d6Var));
        addView(textView, y5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f42567b = textView2;
        ok.n(h6.f19442y6, d6Var, textView2, 1, 14.0f);
        addView(textView2, y5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, d6Var, 20);
        this.f42568c = limitPreviewView;
        addView(limitPreviewView, y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f42566a.setText(eVar.f42558a);
        this.f42567b.setText(eVar.f42559b);
        LimitPreviewView limitPreviewView = this.f42568c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f22341w.setText(String.format("%d", Integer.valueOf(eVar.f42560c)));
    }
}
