package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.lk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.z5;
public final class f extends LinearLayout {
    public final TextView f46240a;
    public final TextView f46241b;
    public final LimitPreviewView f46242c;

    public f(Context context, d6 d6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f46240a = textView;
        k3.m(15.0f, 1, textView);
        textView.setTextColor(h6.w0(h6.G6, d6Var));
        addView(textView, z5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f46241b = textView2;
        lk.o(h6.f21374y6, d6Var, textView2, 1, 14.0f);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, d6Var, 20);
        this.f46242c = limitPreviewView;
        addView(limitPreviewView, z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f46240a.setText(eVar.f46234a);
        this.f46241b.setText(eVar.f46235b);
        LimitPreviewView limitPreviewView = this.f46242c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24294w.setText(String.format("%d", Integer.valueOf(eVar.f46236c)));
    }
}
