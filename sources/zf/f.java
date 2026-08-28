package zf;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class f extends LinearLayout {
    public final TextView f50498a;
    public final TextView f50499b;
    public final LimitPreviewView f50500c;

    public f(Context context, b6 b6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f50498a = textView;
        j3.r0.u(15.0f, 1, textView);
        textView.setTextColor(f6.v0(f6.G6, b6Var));
        addView(textView, e6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f50499b = textView2;
        ll.n(f6.f23369y6, b6Var, textView2, 1, 14.0f);
        addView(textView2, e6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, b6Var, 20);
        this.f50500c = limitPreviewView;
        addView(limitPreviewView, e6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f50498a.setText(eVar.f50488a);
        this.f50499b.setText(eVar.f50489b);
        LimitPreviewView limitPreviewView = this.f50500c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f26462w.setText(String.format("%d", Integer.valueOf(eVar.f50490c)));
    }
}
