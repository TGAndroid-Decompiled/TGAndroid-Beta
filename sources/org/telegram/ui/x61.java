package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;
public final class x61 extends FrameLayout {
    public final ImageView f44385a;
    public final TextView f44386b;
    public final TextView f44387c;
    public final Switch d;
    public boolean f44388e;

    public x61(Activity activity, boolean z10) {
        super(activity);
        int i9;
        int i10;
        this.f44388e = false;
        ImageView imageView = new ImageView(activity);
        this.f44385a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.f44386b = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        if (z10) {
            i9 = 64;
        } else {
            i9 = 0;
        }
        linearLayout.addView(textView, g7.e6.t(-1, -2, 0, 0, 0, i9, 0));
        TextView textView2 = new TextView(activity);
        this.f44387c = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
        if (z10) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        linearLayout.addView(textView2, g7.e6.t(-1, -2, 0, 0, 4, i10, 0));
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        if (z10) {
            Switch r22 = new Switch(activity, null);
            this.d = r22;
            r22.setDrawIconType(1);
            addView(r22, g7.e6.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f44388e) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Switch r02 = this.d;
        if (r02 != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(r02.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.f44386b.getText());
            sb2.append("\n");
            sb2.append((Object) this.f44387c.getText());
            sb2.append("\n");
            if (r02.h) {
                i9 = R.string.NotificationsOn;
            } else {
                i9 = R.string.NotificationsOff;
            }
            sb2.append(LocaleController.getString(i9));
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }
}
