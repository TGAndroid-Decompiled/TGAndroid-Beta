package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.a6;
public final class f extends LinearLayout {
    public final TextView f45175a;
    public final TextView f45176b;
    public final LimitPreviewView f45177c;

    public f(Context context, c6 c6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f45175a = textView;
        k3.m(15.0f, 1, textView);
        textView.setTextColor(g6.w0(g6.G6, c6Var));
        addView(textView, a6.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f45176b = textView2;
        yh.n(g6.f20288y6, c6Var, textView2, 1, 14.0f);
        addView(textView2, a6.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, c6Var, 20);
        this.f45177c = limitPreviewView;
        addView(limitPreviewView, a6.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f45175a.setText(eVar.f45166a);
        this.f45176b.setText(eVar.f45167b);
        LimitPreviewView limitPreviewView = this.f45177c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f23239w.setText(String.format("%d", Integer.valueOf(eVar.f45168c)));
    }
}
