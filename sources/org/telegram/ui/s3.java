package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s3 extends FrameLayout {
    public final TextView f42544a;
    public final TextView f42545b;
    public boolean f42546c;
    public final boolean d;
    public final l4 f42547e;

    public s3(l4 l4Var, Context context, boolean z10) {
        super(context);
        int i9;
        this.f42547e = l4Var;
        this.d = z10;
        setTag(90);
        TextView textView = new TextView(context);
        this.f42544a = textView;
        if (z10) {
            i9 = R.string.PreviewFeedbackAuto;
        } else {
            i9 = R.string.PreviewFeedback2;
        }
        textView.setText(LocaleController.getString(i9));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        addView(textView, g7.e6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f42545b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        addView(textView2, g7.e6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }
}
