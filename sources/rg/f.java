package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.w5;
public final class f extends LinearLayout {
    public final TextView f47465a;
    public final TextView f47466b;
    public final LimitPreviewView f47467c;

    public f(Context context, c6 c6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f47465a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(h6.w0(h6.G6, c6Var));
        addView(textView, w5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f47466b = textView2;
        am.o(h6.f20946y6, c6Var, textView2, 1, 14.0f);
        addView(textView2, w5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, c6Var, 20);
        this.f47467c = limitPreviewView;
        addView(limitPreviewView, w5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f47465a.setText(eVar.f47454a);
        this.f47466b.setText(eVar.f47455b);
        LimitPreviewView limitPreviewView = this.f47467c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24032w.setText(String.format("%d", Integer.valueOf(eVar.f47456c)));
    }
}
