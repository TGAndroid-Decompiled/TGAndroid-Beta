package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s3 extends FrameLayout {
    public final TextView f41002a;
    public final TextView f41003b;
    public boolean f41004c;
    public final boolean d;
    public final l4 f41005e;

    public s3(l4 l4Var, Context context, boolean z4) {
        super(context);
        int i10;
        this.f41005e = l4Var;
        this.d = z4;
        setTag(90);
        TextView textView = new TextView(context);
        this.f41002a = textView;
        if (z4) {
            i10 = R.string.PreviewFeedbackAuto;
        } else {
            i10 = R.string.PreviewFeedback2;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        addView(textView, k7.c6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f41003b = textView2;
        textView2.setTextSize(1, 12.0f);
        textView2.setGravity(19);
        textView2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        addView(textView2, k7.c6.d(-1, 34.0f, 51, 0.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
    }
}
