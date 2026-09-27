package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.qk;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.y5;
public final class f extends LinearLayout {
    public final TextView f42612a;
    public final TextView f42613b;
    public final LimitPreviewView f42614c;

    public f(Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f42612a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(i6.v0(i6.G6, e6Var));
        addView(textView, y5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f42613b = textView2;
        qk.n(i6.f19442y6, e6Var, textView2, 1, 14.0f);
        addView(textView2, y5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, e6Var, 20);
        this.f42614c = limitPreviewView;
        addView(limitPreviewView, y5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f42612a.setText(eVar.f42604a);
        this.f42613b.setText(eVar.f42605b);
        LimitPreviewView limitPreviewView = this.f42614c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f22344w.setText(String.format("%d", Integer.valueOf(eVar.f42606c)));
    }
}
