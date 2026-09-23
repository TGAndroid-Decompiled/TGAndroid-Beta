package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ul;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.x5;
public final class f extends LinearLayout {
    public final TextView f42234a;
    public final TextView f42235b;
    public final LimitPreviewView f42236c;

    public f(Context context, d6 d6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f42234a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(h6.v0(h6.G6, d6Var));
        addView(textView, x5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f42235b = textView2;
        ul.o(h6.f19170y6, d6Var, textView2, 1, 14.0f);
        addView(textView2, x5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, d6Var, 20);
        this.f42236c = limitPreviewView;
        addView(limitPreviewView, x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f42234a.setText(eVar.f42226a);
        this.f42235b.setText(eVar.f42227b);
        LimitPreviewView limitPreviewView = this.f42236c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f22090w.setText(String.format("%d", Integer.valueOf(eVar.f42228c)));
    }
}
