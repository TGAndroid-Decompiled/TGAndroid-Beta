package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.x5;
public final class f extends LinearLayout {
    public final TextView f46089a;
    public final TextView f46090b;
    public final LimitPreviewView f46091c;

    public f(Context context, f6 f6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f46089a = textView;
        e2.m(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        addView(textView, x5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f46090b = textView2;
        vl.n(j6.f21043y6, f6Var, textView2, 1, 14.0f);
        addView(textView2, x5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, f6Var, 20);
        this.f46091c = limitPreviewView;
        addView(limitPreviewView, x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f46089a.setText(eVar.f46073a);
        this.f46090b.setText(eVar.f46074b);
        LimitPreviewView limitPreviewView = this.f46091c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24065w.setText(String.format("%d", Integer.valueOf(eVar.f46075c)));
    }
}
