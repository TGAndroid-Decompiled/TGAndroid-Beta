package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import w7.z5;
public final class f extends LinearLayout {
    public final TextView f46107a;
    public final TextView f46108b;
    public final LimitPreviewView f46109c;

    public f(Context context, d6 d6Var) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        TextView textView = new TextView(context);
        this.f46107a = textView;
        e2.l(15.0f, 1, textView);
        textView.setTextColor(i6.v0(i6.G6, d6Var));
        addView(textView, z5.p(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.f46108b = textView2;
        bi.m(i6.f21209y6, d6Var, textView2, 1, 14.0f);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, d6Var, 20);
        this.f46109c = limitPreviewView;
        addView(limitPreviewView, z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(e eVar) {
        this.f46107a.setText(eVar.f46100a);
        this.f46108b.setText(eVar.f46101b);
        LimitPreviewView limitPreviewView = this.f46109c;
        limitPreviewView.v.setText(String.format("%d", Integer.valueOf(eVar.d)));
        limitPreviewView.f24255w.setText(String.format("%d", Integer.valueOf(eVar.f46102c)));
    }
}
