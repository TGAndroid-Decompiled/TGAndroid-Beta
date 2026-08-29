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
public class qv0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f41784a;
    public final TextView f41785b;
    public final ImageView f41786c;
    public final ImageView d;
    public boolean f41787e;
    public fw0 f41788f;
    public org.telegram.ui.Components.n5 h;
    public Drawable f41789n;

    public qv0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f41784a = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(15);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        linearLayout.addView(h5Var, i7.f6.n(-1, -2));
        TextView textView = new TextView(context);
        this.f41785b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, i7.f6.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, i7.f6.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f41786c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, i7.f6.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, c6Var));
        addView(imageView2, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(fw0 fw0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && fw0Var.f38243a == 12 && fw0Var.f38244b == R.drawable.filled_premium_status2) {
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
        this.f41788f = fw0Var;
        this.f41784a.l(fw0Var.f38245c, false);
        this.f41785b.setText(fw0Var.d);
        this.f41786c.setImageResource(fw0Var.f38244b);
        this.f41787e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 == 0) {
            if (this.f41789n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f41789n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23383v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f41789n, z10);
            return;
        }
        this.h.j(j10, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f30852s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f30852s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f30852s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23383v6, false)));
            this.h.draw(canvas);
        }
        if (this.f41787e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23183k0);
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
