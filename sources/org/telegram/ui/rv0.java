package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;

public class rv0 extends FrameLayout {

    public final org.telegram.ui.ActionBar.h5 f42346a;

    public final TextView f42347b;

    public final ImageView f42348c;
    public final ImageView d;

    public boolean f42349e;

    public gw0 f42350f;
    public org.telegram.ui.Components.i5 h;

    public Drawable f42351n;

    public rv0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f42346a = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        linearLayout.addView(h5Var, h7.z5.n(-1, -2));
        TextView textView = new TextView(context);
        this.f42347b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, h7.z5.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, h7.z5.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f42348c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, h7.z5.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, c6Var));
        addView(imageView2, h7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(gw0 gw0Var, boolean z10) {
        boolean zIsPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (zIsPremium && gw0Var.f38486a == 12 && gw0Var.f38487b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
            b(emojiStatusDocumentId == null ? 0L : emojiStatusDocumentId.longValue(), false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.i5 i5Var = this.h;
            if (i5Var != null) {
                i5Var.b();
                this.h = null;
            }
        }
        this.f42350f = gw0Var;
        this.f42346a.l(gw0Var.f38488c, false);
        this.f42347b.setText(gw0Var.d);
        this.f42348c.setImageResource(gw0Var.f38487b);
        this.f42349e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 != 0) {
            this.h.j(j10, z10);
            return;
        }
        if (this.f42351n == null) {
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
            this.f42351n = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23373v6, false), PorterDuff.Mode.SRC_IN));
        }
        this.h.g(this.f42351n, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f29232s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f29232s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f29232s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23373v6, false)));
            this.h.draw(canvas);
        }
        if (this.f42349e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.i5 i5Var = this.h;
        if (i5Var != null) {
            i5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
