package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.x5;
public final class f extends LinearLayout {
    public final TextView f46088a;
    public final TextView f46089b;
    public final LimitPreviewView f46090c;

    public f(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f46088a = textView;
        e2.m(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        addView(textView, x5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f46089b = textView2;
        wl.n(j6.f21042y6, f6Var, textView2, 1, 14.0f);
        addView(textView2, x5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, f6Var, 20);
        this.f46090c = limitPreviewView;
        addView(limitPreviewView, x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f46088a.setText(eVar.f46072a);
        this.f46089b.setText(eVar.f46073b);
        LimitPreviewView limitPreviewView = this.f46090c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24064w.setText(String.format("%d", Integer.valueOf(eVar.f46074c)));
    }
}
