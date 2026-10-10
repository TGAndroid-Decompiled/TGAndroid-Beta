package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.x5;
public final class f extends LinearLayout {
    public final TextView f47287a;
    public final TextView f47288b;
    public final LimitPreviewView f47289c;

    public f(Context context, e6 e6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f47287a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(i6.w0(i6.G6, e6Var));
        addView(textView, x5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f47288b = textView2;
        bi.o(i6.f21185y6, e6Var, textView2, 1, 14.0f);
        addView(textView2, x5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, e6Var, 20);
        this.f47289c = limitPreviewView;
        addView(limitPreviewView, x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f47287a.setText(eVar.f47276a);
        this.f47288b.setText(eVar.f47277b);
        LimitPreviewView limitPreviewView = this.f47289c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24258w.setText(String.format("%d", Integer.valueOf(eVar.f47278c)));
    }
}
