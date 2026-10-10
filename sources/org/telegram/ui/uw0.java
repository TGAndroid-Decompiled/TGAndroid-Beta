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
public class uw0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f42615a;
    public final TextView f42616b;
    public final ImageView f42617c;
    public final ImageView d;
    public boolean f42618e;
    public kx0 f42619f;
    public org.telegram.ui.Components.q5 h;
    public Drawable f42620n;

    public uw0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f42615a = j5Var;
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(15);
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        linearLayout.addView(j5Var, w7.x5.n(-1, -2));
        TextView textView = new TextView(context);
        this.f42616b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.x5.p(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, w7.x5.a(-2.0f, 62.0f, 8.0f, 48.0f, 9.0f, -1, 0));
        ImageView imageView = new ImageView(context);
        this.f42617c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.x5.a(28.0f, 18.0f, 12.0f, 0.0f, 0.0f, 28, 0));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.M6, e6Var));
        addView(imageView2, w7.x5.a(24.0f, 0.0f, 0.0f, 18.0f, 0.0f, 24, 21));
    }

    public final void a(kx0 kx0Var, boolean z10) {
        long longValue;
        boolean isPremium = UserConfig.getInstance(UserConfig.selectedAccount).isPremium();
        ImageView imageView = this.d;
        if (isPremium && kx0Var.f39409a == 12 && kx0Var.f39410b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
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
            org.telegram.ui.Components.q5 q5Var = this.h;
            if (q5Var != null) {
                q5Var.b();
                this.h = null;
            }
        }
        this.f42619f = kx0Var;
        this.f42615a.l(kx0Var.f39411c, false);
        this.f42616b.setText(kx0Var.d);
        this.f42617c.setImageResource(kx0Var.f39410b);
        this.f42618e = z10;
    }

    public final void b(long j3, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 == 0) {
            if (this.f42620n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
                this.f42620n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21132v6, false), PorterDuff.Mode.SRC_IN));
            }
            this.h.g(this.f42620n, z10);
            return;
        }
        this.h.j(j3, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f30014s) - AndroidUtilities.dp(21.0f), (getHeight() - this.h.f30014s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + this.h.f30014s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21132v6, false)));
            this.h.draw(canvas);
        }
        if (this.f42618e) {
            canvas.drawRect(AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20923k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.q5 q5Var = this.h;
        if (q5Var != null) {
            q5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
