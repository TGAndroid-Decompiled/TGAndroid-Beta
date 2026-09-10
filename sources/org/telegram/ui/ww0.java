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
public class ww0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f38396a;
    public final TextView f38397b;
    public final ImageView f38398c;
    public final ImageView d;
    public boolean e;
    public mx0 f38399f;
    public org.telegram.ui.Components.n5 h;
    public Drawable f38400n;

    public ww0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f38396a = l5Var;
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(15);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        linearLayout.addView(l5Var, w7.a6.n(-1, -2));
        TextView textView = new TextView(context);
        this.f38397b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.a6.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.a6.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f38398c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.a6.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.M6, f6Var));
        addView(imageView2, w7.a6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(mx0 mx0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && mx0Var.f35073a == 12 && mx0Var.f35074b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
            if (emojiStatusDocumentId == null) {
                longValue = 0;
            } else {
                longValue = emojiStatusDocumentId.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.n5 n5Var = this.h;
            if (n5Var != null) {
                n5Var.b();
                this.h = null;
            }
        }
        this.f38399f = mx0Var;
        this.f38396a.l(mx0Var.f35075c, false);
        this.f38397b.setText(mx0Var.d);
        this.f38398c.setImageResource(mx0Var.f35074b);
        this.e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f38400n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f38400n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18254v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f38400n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f25415s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f25415s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f25415s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18254v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.n5 n5Var = this.h;
        if (n5Var != null) {
            n5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
