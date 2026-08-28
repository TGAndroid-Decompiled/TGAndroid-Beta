package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class zz extends FrameLayout {
    public final a00 f45276a;

    public zz(a00 a00Var, Context context) {
        super(context);
        int i9;
        String string;
        this.f45276a = a00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false)));
        addView(imageView, g7.e6.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        dh.u uVar = new dh.u(context);
        uVar.setTypeface(AndroidUtilities.bold());
        uVar.setTextSize(1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        uVar.setGravity(1);
        uVar.setText(a00Var.Q(uVar));
        MessagesController.DialogFilter dialogFilter = a00Var.T;
        if (dialogFilter != null && dialogFilter.title_noanimate) {
            i9 = 26;
        } else {
            i9 = 0;
        }
        uVar.h = i9;
        addView(uVar, g7.e6.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (a00Var.U.isEmpty()) {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty);
        } else {
            string = LocaleController.getString(R.string.FolderLinkShareSubtitle);
        }
        textView.setText(string);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        addView(textView, g7.e6.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.C6, false), PorterDuff.Mode.MULTIPLY));
        imageView2.setOnClickListener(new a(this, 23));
        addView(imageView2, g7.e6.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), 1073741824));
    }
}
